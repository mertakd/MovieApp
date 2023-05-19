package com.sisifos.movieapp.domain.usecase

import com.sisifos.movieapp.data.model.tvshow.TvShow
import com.sisifos.movieapp.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.updateTvShows()
}