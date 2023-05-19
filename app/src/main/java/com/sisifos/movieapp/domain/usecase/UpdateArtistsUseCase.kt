package com.sisifos.movieapp.domain.usecase

import com.sisifos.movieapp.data.model.artist.Artist
import com.sisifos.movieapp.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}