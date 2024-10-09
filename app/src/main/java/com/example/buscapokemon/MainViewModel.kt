package com.example.buscapokemon

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.buscapokemon.data.PokemonRepository
import com.example.buscapokemon.data.api.RetrofitClient
import com.example.buscapokemon.data.api.model.PokemonResponse
import com.example.buscapokemon.domain.Pokemon
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {
    private val repository = PokemonRepository(RetrofitClient.pokemonApi)
    val pokemonResponse = MutableLiveData<Pokemon>()

    fun fetchPokemon(id: Int, onResult: (Pokemon) -> Unit) {
        viewModelScope.launch {
            val pokemon = repository.getPokemonData(id)
            withContext(Dispatchers.Main) {
                pokemonResponse.value = pokemon
            }
        }
    }
}