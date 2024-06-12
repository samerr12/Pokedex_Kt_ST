package com.example.pokedex1_2

fun adicionar_pokemons(): Array<Pokemon> {

    var conjunto_pokemons: Array<Pokemon> = arrayOf()


    /* ------------------------------ LISTAGEM DOS POKEMONS ------------------------------ */


    var Bulbassaur: Pokemon = Pokemon("#0001", "bubassaur", "Grass", "Poison", "bulbassaur",
        16, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(0), arrayOf(adicionar_ovo().get(1)),
        "There is a seed on its back. By soaking up the sun's rays, the seed grows progressively larger.")

    var Ivysaur: Pokemon = Pokemon("#0002", "bubassaur", "Grass", "Poison", "ivysaur",
        32, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(1), arrayOf(adicionar_ovo().get(1)),
        "")

    var Venusaur: Pokemon = Pokemon("#0003", "bubassaur", "Grass", "Poison", "venusaur",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(2), arrayOf(adicionar_ovo().get(1)),
        "")

    var Charmander: Pokemon = Pokemon("#0004", "charmander", "", "", "charmander",
        16, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(3), arrayOf(adicionar_ovo().get(1)),
        "")

    var Charmeleon: Pokemon = Pokemon("#0005", "charmeleon", "", "", "charmeleon",
        36, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(4), arrayOf(adicionar_ovo().get(1)),
        "")

    var Charizard: Pokemon = Pokemon("#0006", "charizard", "", "", "charizard",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(5), arrayOf(adicionar_ovo().get(1)),
        "")

    var Squirtle: Pokemon = Pokemon("#0007", "squirtle", "", "", "squirtle",
        16, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(6), arrayOf(adicionar_ovo().get(1)),
        "")


    var Wartortle: Pokemon = Pokemon("#0008", "wartortle", "", "", "wartortle",
        36, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(7), arrayOf(adicionar_ovo().get(1)),
        "")

    var Blastoise: Pokemon = Pokemon("#0009", "blastoise", "", "", "blastoise",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(8), arrayOf(adicionar_ovo().get(1)),
        "")

    var Caterpie: Pokemon = Pokemon("#0010", "caterpie", "", "", "caterpie",
        32, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(9), arrayOf(adicionar_ovo().get(1)),
        "")

    var Metapod: Pokemon = Pokemon("#0011", "metapod", "", "", "metapod",
        32, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(9), arrayOf(adicionar_ovo().get(1)),
        "")

    var Butterfree: Pokemon = Pokemon("#0012", "butterfree", "", "", "butterfree",
        32, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(0), arrayOf(adicionar_ovo().get(1)),
        "")

    var Weedle: Pokemon = Pokemon("#0013", "weedle", "", "", "weedle",
        32, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(0), arrayOf(adicionar_ovo().get(1)),
        "")

    var Kakuna: Pokemon = Pokemon("#0014", "kakuna", "", "", "kakuna",
        32, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(0), arrayOf(adicionar_ovo().get(1)),
        "")

    var Beedrill: Pokemon = Pokemon("#0015", "beedrill", "", "", "beedrill",
        32, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(0), arrayOf(adicionar_ovo().get(1)),
        "")

    var Pidgey: Pokemon = Pokemon("#0016", "pidgey", "", "", "pidgey",
        32, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(0), arrayOf(adicionar_ovo().get(1)),
        "")

    var Pidgeotto: Pokemon = Pokemon("#0017", "pidgeotto", "", "", "pidgeotto",
        32, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(0), arrayOf(adicionar_ovo().get(1)),
        "")

    var Pidgeot: Pokemon = Pokemon("#0018", "pidgeot", "", "", "pidgeot",
        32, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(0), arrayOf(adicionar_ovo().get(1)),
        "")




    conjunto_pokemons = arrayOf(Bulbassaur, Ivysaur, Venusaur, Charmander, Charmeleon, Charizard, Squirtle, Wartortle, Blastoise,
        Caterpie, Metapod, Butterfree, Weedle, Kakuna, Beedrill, Pidgey, Pidgeotto, Pidgeot)

    return conjunto_pokemons
}

fun adicionar_terreno(): Terreno_regiao {

    var conjunto_pokemons:Array<Pokemon> = adicionar_pokemons()

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