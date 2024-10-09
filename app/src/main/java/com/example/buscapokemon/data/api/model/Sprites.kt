package com.example.buscapokemon.data.api.model

import com.google.gson.annotations.SerializedName

data class Sprites(
    @SerializedName(("front_default")) val front_default: String?,
    @SerializedName("back_default") val back_default: String?,
    @SerializedName("front_shiny") val front_shiny: String?,
    @SerializedName("back_shiny") val back_shiny: String?
)