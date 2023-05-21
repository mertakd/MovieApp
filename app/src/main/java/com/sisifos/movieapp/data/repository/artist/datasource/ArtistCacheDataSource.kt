package com.sisifos.movieapp.data.repository.artist.datasource

import com.sisifos.movieapp.data.model.artist.Artist
import com.sisifos.movieapp.data.model.movie.Movie

interface ArtistCacheDataSource {
    suspend fun getArtistsFromCache():List<Artist>
    suspend fun saveArtistsToCache(artists:List<Artist>)

}