package com.sisifos.movieapp.data.repository.movie.datasource

import com.sisifos.movieapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
   suspend fun getMovies(): Response<MovieList>
}