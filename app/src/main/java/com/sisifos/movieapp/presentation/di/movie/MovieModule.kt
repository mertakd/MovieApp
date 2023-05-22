package com.sisifos.movieapp.presentation.di.movie

import com.sisifos.movieapp.domain.usecase.GetArtistsUseCase
import com.sisifos.movieapp.domain.usecase.GetMoviesUseCase
import com.sisifos.movieapp.domain.usecase.UpdateArtistsUseCase
import com.sisifos.movieapp.domain.usecase.UpdateMoviesUsecase
import com.sisifos.movieapp.presentation.artist.ArtistViewModelFactory
import com.sisifos.movieapp.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}