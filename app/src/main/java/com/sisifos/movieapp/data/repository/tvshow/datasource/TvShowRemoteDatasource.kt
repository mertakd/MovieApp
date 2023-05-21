package com.sisifos.movieapp.data.repository.tvshow.datasource

import com.sisifos.movieapp.data.model.movie.MovieList
import com.sisifos.movieapp.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}