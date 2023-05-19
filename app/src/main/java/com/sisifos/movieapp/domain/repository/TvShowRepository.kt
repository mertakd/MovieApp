package com.sisifos.movieapp.domain.repository

import com.sisifos.movieapp.data.model.tvshow.TvShow

interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}