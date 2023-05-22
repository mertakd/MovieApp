package com.sisifos.movieapp.presentation.di.core

import com.sisifos.movieapp.data.db.ArtistDao
import com.sisifos.movieapp.data.db.MovieDao
import com.sisifos.movieapp.data.db.TvShowDao
import com.sisifos.movieapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.sisifos.movieapp.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.sisifos.movieapp.data.repository.movie.datasource.MovieLocalDataSource
import com.sisifos.movieapp.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.sisifos.movieapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.sisifos.movieapp.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {


    //daoları parametre verdiğimiz için oluşturuyoruz.
    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao):TvShowLocalDataSource{
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao):ArtistLocalDataSource{
        return ArtistLocalDataSourceImpl(artistDao)
    }


}