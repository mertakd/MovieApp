package com.sisifos.movieapp.data.repository.tvshow.datasource

import com.sisifos.movieapp.data.model.movie.Movie
import com.sisifos.movieapp.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)

}