package com.sisifos.movieapp.presentation.di.tvshow

import com.sisifos.movieapp.domain.usecase.GetArtistsUseCase
import com.sisifos.movieapp.domain.usecase.GetTvShowsUseCase
import com.sisifos.movieapp.domain.usecase.UpdateArtistsUseCase
import com.sisifos.movieapp.domain.usecase.UpdateTvShowsUseCase
import com.sisifos.movieapp.presentation.artist.ArtistViewModelFactory
import com.sisifos.movieapp.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}