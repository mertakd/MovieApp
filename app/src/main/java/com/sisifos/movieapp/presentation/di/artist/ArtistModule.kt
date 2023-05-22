package com.sisifos.movieapp.presentation.di.artist

import com.sisifos.movieapp.domain.usecase.GetArtistsUseCase
import com.sisifos.movieapp.domain.usecase.UpdateArtistsUseCase
import com.sisifos.movieapp.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}