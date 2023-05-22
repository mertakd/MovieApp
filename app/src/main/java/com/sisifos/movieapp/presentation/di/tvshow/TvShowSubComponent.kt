package com.sisifos.movieapp.presentation.di.tvshow

import com.sisifos.movieapp.presentation.artist.ArtistActivity
import com.sisifos.movieapp.presentation.tv.TvShowActivity
import dagger.Subcomponent

@TvShowScope
@Subcomponent(modules = [TvShowModule::class])
interface TvShowSubComponent {
    fun inject(tvShowActivity: TvShowActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():TvShowSubComponent
    }

}

