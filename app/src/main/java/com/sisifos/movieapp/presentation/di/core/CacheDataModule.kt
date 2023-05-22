package com.sisifos.movieapp.presentation.di.core

import com.sisifos.movieapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.sisifos.movieapp.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.sisifos.movieapp.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.sisifos.movieapp.data.repository.movie.datasource.MovieCacheDataSource
import com.sisifos.movieapp.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.sisifos.movieapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.sisifos.movieapp.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import com.sisifos.movieapp.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module

class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}