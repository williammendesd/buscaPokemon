package com.example.buscapokemon.data.api.model

data class PokemonResponse(
    val name: String,
    val weight: Int,
    val height: Int,
    val officialArtwork: String,
    val sprites: Sprites
)