package com.sisifos.movieapp.data.repository.tvshow.datasourceImpl

import com.sisifos.movieapp.data.api.TMDBService
import com.sisifos.movieapp.data.model.tvshow.TvShowList
import com.sisifos.movieapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

