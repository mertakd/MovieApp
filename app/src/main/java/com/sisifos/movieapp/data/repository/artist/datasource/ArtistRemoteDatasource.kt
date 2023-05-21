package com.sisifos.movieapp.data.repository.artist.datasource

import com.sisifos.movieapp.data.model.artist.ArtistList
import com.sisifos.movieapp.data.model.movie.MovieList
import retrofit2.Response

interface ArtistRemoteDatasource {
   suspend fun getArtists(): Response<ArtistList>
}