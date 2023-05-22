package com.sisifos.movieapp.presentation.di

import com.sisifos.movieapp.presentation.di.artist.ArtistSubComponent
import com.sisifos.movieapp.presentation.di.movie.MovieSubComponent
import com.sisifos.movieapp.presentation.di.tvshow.TvShowSubComponent

interface Injector {
   fun createMovieSubComponent():MovieSubComponent
   fun createTvShowSubComponent():TvShowSubComponent
   fun createArtistSubComponent():ArtistSubComponent
}