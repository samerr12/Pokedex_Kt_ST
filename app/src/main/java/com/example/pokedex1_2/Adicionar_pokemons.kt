package com.example.pokedex1_2

fun adicionar_pokemons(): Terreno_regiao {

    var conjunto_pokemons: Array<Pokemon> = arrayOf()


    /* ------------------------------ LISTAGEM DOS POKEMONS ------------------------------ */

    var Bulbassaur: Pokemon = Pokemon("#0001", "bubassaur", "Grass", "Poison", "", "bulbassaur")
    var Ivysaur: Pokemon = Pokemon("#0002", "bubassaur", "Grass", "Poison", "", "ivysaur")
    var Venusaur: Pokemon = Pokemon("#0003", "bubassaur", "Grass", "Poison", "", "venusaur")
    var Charmander: Pokemon = Pokemon("#0004", "charmander", "", "", "", "charmander")
    var Charmeleon: Pokemon = Pokemon("#0005", "charmeleon", "", "", "", "charmeleon")
    var Charizard: Pokemon = Pokemon("#0006", "charizard", "", "", "", "charizard")
    var Squirtle: Pokemon = Pokemon("#0007", "squirtle", "", "", "", "squirtle")
    var Wartortle: Pokemon = Pokemon("#0008", "wartortle", "", "", "", "wartortle")
    var Blastoise: Pokemon = Pokemon("#0009", "blastoise", "", "", "", "blastoise")
    var Caterpie: Pokemon = Pokemon("#0010", "caterpie", "", "", "", "caterpie")
    var Metapod: Pokemon = Pokemon("#0011", "metapod", "", "", "", "metapod")
    var Butterfree: Pokemon = Pokemon("#0012", "butterfree", "", "", "", "butterfree")
    var Weedle: Pokemon = Pokemon("#0013", "weedle", "", "", "", "weedle")
    var Kakuna: Pokemon = Pokemon("#0014", "kakuna", "", "", "", "kakuna")
    var Beedrill: Pokemon = Pokemon("#0015", "beedrill", "", "", "", "beedrill")
    var Pidgey: Pokemon = Pokemon("#0016", "pidgey", "", "", "", "pidgey")
    var Pidgeotto: Pokemon = Pokemon("#0017", "pidgeotto", "", "", "", "pidgeotto")
    var Pidgeot: Pokemon = Pokemon("#0018", "pidgeot", "", "", "", "pidgeot")




    conjunto_pokemons = arrayOf(Bulbassaur, Ivysaur, Venusaur, Charmander, Charmeleon, Charizard, Squirtle, Wartortle, Blastoise,
        Caterpie, Metapod, Butterfree, Weedle, Kakuna, Beedrill, Pidgey, Pidgeotto, Pidgeot)

    /* ------------------------------ SEPARAÇÃO DE CODIGO ------------------------------ */

    var terreno: Terreno_regiao
    var rotas: Rota
    var tile: Tiles
    var pokemon_tiled: Pokemon_Tiled

    var conjunto_rotas: Array<Rota> = arrayOf()

    for (pokemon_info in conjunto_pokemons) {

        pokemon_tiled = Pokemon_Tiled(pokemon_info, 33)
        var conjunto_pokemons: Array<Pokemon_Tiled> = arrayOf(pokemon_tiled)

        tile = Tiles("Fishing", conjunto_pokemons)
        var conjunto_tiles: Array<Tiles> = arrayOf(tile)

        rotas = Rota("Pallet Town", conjunto_tiles)
        conjunto_rotas = arrayOf(rotas)
    }

    terreno = Terreno_regiao("Kanto", conjunto_rotas)

    return terreno
}