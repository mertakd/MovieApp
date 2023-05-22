package com.sisifos.movieapp.presentation.di.core

import com.sisifos.movieapp.data.api.TMDBService
import com.sisifos.movieapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.sisifos.movieapp.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.sisifos.movieapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.sisifos.movieapp.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.sisifos.movieapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.sisifos.movieapp.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    //MovieRemoteDataSourceImpl sınıfında parametre olarak gerekiyor. bu sınıfın oluşturulma amacı bu.
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }


}