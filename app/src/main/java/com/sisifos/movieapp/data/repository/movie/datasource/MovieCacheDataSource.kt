package com.sisifos.movieapp.data.repository.movie.datasource

import com.sisifos.movieapp.data.model.movie.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}