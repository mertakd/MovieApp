package com.sisifos.movieapp.data.repository.movie.datasourceImpl

import com.sisifos.movieapp.data.api.TMDBService
import com.sisifos.movieapp.data.model.movie.MovieList
import com.sisifos.movieapp.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {


    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

    /*
    override suspend fun getMovies(): Response<MovieList>{
        return tmdbService.getPopularMovies(apiKey)
    }
    */
}

