package com.sisifos.movieapp.domain.repository

import com.sisifos.movieapp.data.model.artist.Artist

interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}