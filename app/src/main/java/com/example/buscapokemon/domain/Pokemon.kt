package com.example.buscapokemon.domain

data class Pokemon (
    val name: String,
    val height: Int,
    val weight: Int,
    val officialArtwork: String,
    val imagesURL: List<String>
)
