package com.sisifos.movieapp.domain.repository

import com.sisifos.movieapp.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?

}