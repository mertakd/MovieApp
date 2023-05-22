package com.sisifos.movieapp.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.sisifos.movieapp.data.db.ArtistDao
import com.sisifos.movieapp.data.db.MovieDao
import com.sisifos.movieapp.data.db.TMDBDatabase
import com.sisifos.movieapp.data.db.TvShowDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {


    @Singleton
    @Provides
    fun provideMovieDataBase(context: Context):TMDBDatabase{
     return Room.databaseBuilder(context,TMDBDatabase::class.java,"tmdbclient")
         .build()
    }

    //repository implement classlarında parametre olarak kullanılıyor.
    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase):MovieDao{
        return tmdbDatabase.movieDao()
    }

    @Singleton
    @Provides
    fun provideTvDao(tmdbDatabase: TMDBDatabase):TvShowDao{
        return tmdbDatabase.tvDao()
    }

    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase): ArtistDao {
        return tmdbDatabase.artistDao()
    }





}