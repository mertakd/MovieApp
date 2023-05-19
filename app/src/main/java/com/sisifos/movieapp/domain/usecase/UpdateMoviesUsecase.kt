package com.sisifos.movieapp.domain.usecase

import com.sisifos.movieapp.data.model.movie.Movie
import com.sisifos.movieapp.domain.repository.MovieRepository

class UpdateMoviesUsecase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}