package com.sisifos.movieapp.data.model.artist


import com.sisifos.movieapp.data.model.artist.Artist
import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("results")
    val artists: List<Artist>
)