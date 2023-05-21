package com.sisifos.movieapp.data.repository.tvshow.datasource

import com.sisifos.movieapp.data.model.movie.Movie
import com.sisifos.movieapp.data.model.tvshow.TvShow

interface TvShowLocalDataSource {
  suspend fun getTvShowsFromDB():List<TvShow>
  suspend fun saveTvShowsToDB(tvShows:List<TvShow>)
  suspend fun clearAll()
}