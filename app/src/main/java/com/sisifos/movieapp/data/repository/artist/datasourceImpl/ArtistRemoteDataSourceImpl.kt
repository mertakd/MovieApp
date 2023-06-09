package com.sisifos.movieapp.data.repository.artist.datasourceImpl

import com.sisifos.movieapp.data.api.TMDBService
import com.sisifos.movieapp.data.model.artist.ArtistList
import com.sisifos.movieapp.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

