package com.sisifos.movieapp.data.repository.movie


import android.util.Log
import com.sisifos.movieapp.data.repository.movie.datasource.MovieCacheDataSource
import com.sisifos.movieapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.sisifos.movieapp.data.model.movie.Movie
import com.sisifos.movieapp.data.repository.movie.datasource.MovieLocalDataSource
import com.sisifos.movieapp.domain.repository.MovieRepository
import java.lang.Exception

class MovieRepositoryImpl(
    private val movieRemoteDatasource: MovieRemoteDatasource,
    private val movieLocalDataSource: MovieLocalDataSource,
    private val movieCacheDataSource: MovieCacheDataSource

) : MovieRepository {


    override suspend fun getMovies(): List<Movie>? {
        return getMoviesFromCache()
        /*
        * önbellekde veriler mevcutsa sistem cache i döndürüyor
        * orda yoksa getMoviesFromDB yan roomdan alıp döndürür
        * orda yoksa getMoviesFromAPI yani sis tem apiden alır en son  */
    }


    //room dan son veriyi alır günceller kullanıcı verileri.
    override suspend fun updateMovies(): List<Movie>? {
        val newListOfMovies = getMoviesFromAPI()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesToDB(newListOfMovies)
        movieCacheDataSource.saveMoviesToCache(newListOfMovies)
        return newListOfMovies
    }


    suspend fun getMoviesFromAPI(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            val response = movieRemoteDatasource.getMovies()
            val body = response.body()
            if(body!=null){
                movieList = body.movies
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return movieList
    }


    suspend fun getMoviesFromDB():List<Movie>{
        lateinit var movieList: List<Movie>
        try {
            movieList = movieLocalDataSource.getMoviesFromDB() //filmleri roomdan çek
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }

        if(movieList.size>0){
            return movieList //0 dan büyükse veri var demek veriyi çek
        }else{//ama roomda veri yoksa api den veriyi çek room a kaydet
            movieList=getMoviesFromAPI()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }

        return movieList
    }



    suspend fun getMoviesFromCache():List<Movie>{
        lateinit var movieList: List<Movie>
        try {
            movieList =movieCacheDataSource.getMoviesFromCache()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(movieList.size>0){
            return movieList
        }else{
            movieList=getMoviesFromDB()
            movieCacheDataSource.saveMoviesToCache(movieList) // roomdaki veriyi cache e kaydet
        }

        return movieList
    }




}