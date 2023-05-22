package com.sisifos.movieapp.presentation

import android.app.Application
import com.sisifos.movieapp.BuildConfig
import com.sisifos.movieapp.presentation.di.Injector
import com.sisifos.movieapp.presentation.di.artist.ArtistSubComponent
import com.sisifos.movieapp.presentation.di.core.*
import com.sisifos.movieapp.presentation.di.movie.MovieSubComponent
import com.sisifos.movieapp.presentation.di.tvshow.TvShowSubComponent
import javax.inject.Inject

class App : Application(), Injector {
private lateinit var appComponent:AppComponent

    override fun onCreate() {
       super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
       return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }

}