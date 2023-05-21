package com.sisifos.movieapp.data.repository.artist.datasource

import com.sisifos.movieapp.data.model.artist.Artist
import com.sisifos.movieapp.data.model.movie.Movie

interface ArtistLocalDataSource {
  suspend fun getArtistsFromDB():List<Artist>
  suspend fun saveArtistsToDB(artists:List<Artist>)
  suspend fun clearAll()
}