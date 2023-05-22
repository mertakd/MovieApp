package com.sisifos.movieapp.presentation.di.movie

import com.sisifos.movieapp.presentation.artist.ArtistActivity
import com.sisifos.movieapp.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():MovieSubComponent
    }

}

