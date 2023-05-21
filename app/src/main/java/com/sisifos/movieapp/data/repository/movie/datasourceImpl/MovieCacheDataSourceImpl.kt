package com.sisifos.movieapp.data.repository.movie.datasourceImpl

import com.sisifos.movieapp.data.repository.movie.datasource.MovieCacheDataSource
import com.sisifos.movieapp.data.model.movie.Movie


class MovieCacheDataSourceImpl :
    MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
       movieList.clear()
       movieList = ArrayList(movies)
    }
}