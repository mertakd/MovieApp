package com.sisifos.movieapp.presentation.di.core

import com.sisifos.movieapp.data.repository.artist.ArtistRepositoryImpl
import com.sisifos.movieapp.data.repository.artist.datasource.ArtistCacheDataSource
import com.sisifos.movieapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.sisifos.movieapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.sisifos.movieapp.data.repository.movie.MovieRepositoryImpl
import com.sisifos.movieapp.data.repository.movie.datasource.MovieCacheDataSource
import com.sisifos.movieapp.data.repository.movie.datasource.MovieLocalDataSource
import com.sisifos.movieapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.sisifos.movieapp.data.repository.tvshow.TvShowRepositoryImpl
import com.sisifos.movieapp.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.sisifos.movieapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.sisifos.movieapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.sisifos.movieapp.domain.repository.ArtistRepository
import com.sisifos.movieapp.domain.repository.MovieRepository
import com.sisifos.movieapp.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {


    //usecases ler reositoryinstance sini kullanıyor o yüzden bu sınıfı oluşturduk.
    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}