package com.example.buscapokemon.data

import com.example.buscapokemon.data.api.PokemonAPI
import com.example.buscapokemon.domain.Pokemon

class PokemonRepository(private val api: PokemonAPI) {
    suspend fun getPokemonData(id: Int): Pokemon {
        val response = api.getPokemon(id)
        val details = "Name: ${response.name}, Weight: ${response.weight}, Height: ${response.height}, Sprites: Other: Official-Artwork: Front_Default ${response.officialArtwork}"
        val sprites = listOfNotNull(
            response.sprites.front_default,
            response.sprites.back_default,
            response.sprites.front_shiny,
            response.sprites.back_shiny
        )
        return Pokemon(
            response.name,
            response.height,
            response.weight,
            response.officialArtwork,
            sprites,
        )
    }
}
