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

    var Charmander: Pokemon = Pokemon("#0004", "charmander", "Fire", "", "charmander",
        16, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(3), arrayOf(adicionar_ovo().get(1)),
        "")

    var Charmeleon: Pokemon = Pokemon("#0005", "charmeleon", "Fire", "", "charmeleon",
        36, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(4), arrayOf(adicionar_ovo().get(1)),
        "")

    var Charizard: Pokemon = Pokemon("#0006", "charizard", "Fire", "Flying", "charizard",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(5), arrayOf(adicionar_ovo().get(1)),
        "")

    var Squirtle: Pokemon = Pokemon("#0007", "squirtle", "Water", "", "squirtle",
        16, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(6), arrayOf(adicionar_ovo().get(1)),
        "")


    var Wartortle: Pokemon = Pokemon("#0008", "wartortle", "Water", "", "wartortle",
        36, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(7), arrayOf(adicionar_ovo().get(1)),
        "")

    var Blastoise: Pokemon = Pokemon("#0009", "blastoise", "Water", "", "blastoise",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(8), arrayOf(adicionar_ovo().get(1)),
        "")

    var Caterpie: Pokemon = Pokemon("#0010", "caterpie", "Bug", "", "caterpie",
        7, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(9), arrayOf(adicionar_ovo().get(1)),
        "")

    var Metapod: Pokemon = Pokemon("#0011", "metapod", "Bug", "", "metapod",
        10, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(10), arrayOf(adicionar_ovo().get(1)),
        "")

    var Butterfree: Pokemon = Pokemon("#0012", "butterfree", "Bug", "Flying", "butterfree",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(11), arrayOf(adicionar_ovo().get(1)),
        "")

    var Weedle: Pokemon = Pokemon("#0013", "weedle", "Bug", "Poison", "weedle",
        7, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(12), arrayOf(adicionar_ovo().get(1)),
        "")

    var Kakuna: Pokemon = Pokemon("#0014", "kakuna", "Bug", "Poison", "kakuna",
        10, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(13), arrayOf(adicionar_ovo().get(1)),
        "")

    var Beedrill: Pokemon = Pokemon("#0015", "beedrill", "Bug", "Poison", "beedrill",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(14), arrayOf(adicionar_ovo().get(1)),
        "")

    var Pidgey: Pokemon = Pokemon("#0016", "pidgey", "Normal", "Flying", "pidgey",
        18, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(15), arrayOf(adicionar_ovo().get(1)),
        "")

    var Pidgeotto: Pokemon = Pokemon("#0017", "pidgeotto", "Normal", "Flying", "pidgeotto",
        36, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(16), arrayOf(adicionar_ovo().get(1)),
        "")

    var Pidgeot: Pokemon = Pokemon("#0018", "pidgeot", "Normal", "Flying", "pidgeot",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(17), arrayOf(adicionar_ovo().get(1)),
        "")

    var Rattata: Pokemon = Pokemon("#0019", "Rattata", "Normal", "", "rattata",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(18), arrayOf(adicionar_ovo().get(1)),
        "")

    var Raticate: Pokemon = Pokemon("#0022", "Raticate", "Normal", "", "raticate",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(19), arrayOf(adicionar_ovo().get(1)),
        "")

    var Spearow: Pokemon = Pokemon("#0023", "Spearow", "Normal", "Flying", "spearow",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(20), arrayOf(adicionar_ovo().get(1)),
        "")

    var Fearow: Pokemon = Pokemon("#0024", "Fearow", "Normal", "Flying", "fearow",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(21), arrayOf(adicionar_ovo().get(1)),
        "")

    var Ekans: Pokemon = Pokemon("#0025", "Ekans", "Poison", "", "ekans",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(22), arrayOf(adicionar_ovo().get(1)),
        "")

    var Arbok: Pokemon = Pokemon("#0026", "Arbok", "Poison", "", "arbok",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(23), arrayOf(adicionar_ovo().get(1)),
        "")

    var Pikachu: Pokemon = Pokemon("#0027", "Pikachu", "Electric", "", "pikachu",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(24), arrayOf(adicionar_ovo().get(1)),
        "")

    var Raichu: Pokemon = Pokemon("#0028", "Raichu", "Electric", "", "raichu",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(25), arrayOf(adicionar_ovo().get(1)),
        "")

    var Sandshrew: Pokemon = Pokemon("#0029", "Sandshrew", "Ground", "", "sandshrew",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(26), arrayOf(adicionar_ovo().get(1)),
        "")

    var Sandslash: Pokemon = Pokemon("#0030", "Sandslash", "Ground", "", "sandslash",
        0, arrayOf(adicionar_habilidades().get(64), adicionar_habilidades().get(33)),
        adicionar_status().get(27), arrayOf(adicionar_ovo().get(1)),
        "")


    conjunto_pokemons = arrayOf(Bulbassaur, Ivysaur, Venusaur, Charmander, Charmeleon, Charizard, Squirtle, Wartortle, Blastoise,
        Caterpie, Metapod, Butterfree, Weedle, Kakuna, Beedrill, Pidgey, Pidgeotto, Pidgeot, Rattata, Raticate, Spearow,
        Fearow, Ekans, Arbok, Pikachu, Raichu, Sandshrew, Sandslash)

    return conjunto_pokemons
}

fun adicionar_terreno(): Terreno_regiao {

    /*
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

     */

    //parte nova

    var Bulbassaur = Pokemon_Tiled(adicionar_pokemons().get(0), 45)
    var Ivysaur = Pokemon_Tiled(adicionar_pokemons().get(1), 45)
    var Venusaur = Pokemon_Tiled(adicionar_pokemons().get(2), 45)
    var Charmander = Pokemon_Tiled(adicionar_pokemons().get(3), 45)
    var Charmeleon = Pokemon_Tiled(adicionar_pokemons().get(4), 45)
    var Charizard = Pokemon_Tiled(adicionar_pokemons().get(5), 45)
    var Squirtle = Pokemon_Tiled(adicionar_pokemons().get(6), 45)
    var Wartortle = Pokemon_Tiled(adicionar_pokemons().get(7), 255)
    var Blastoise = Pokemon_Tiled(adicionar_pokemons().get(8), 45)
    var Caterpie = Pokemon_Tiled(adicionar_pokemons().get(9), 255)

    var conjunto_chace: Array<Pokemon_Tiled> = arrayOf(Bulbassaur, Ivysaur, Venusaur, Charmander, Charmeleon, Charizard,
        Squirtle, Wartortle, Blastoise, Caterpie)

    //tipos de terreno

    var Old_Rod: Tiles = Tiles("Old_Rod", arrayOf(conjunto_chace.get(6)))
    var Good_Rod: Tiles = Tiles("Good_Rod", arrayOf(conjunto_chace.get(7)))
    var Great_Rod: Tiles = Tiles("Great_Rod", arrayOf(conjunto_chace.get(8)))
    var Swimming: Tiles = Tiles("Swimming", arrayOf(conjunto_chace.get(6), conjunto_chace.get(7), conjunto_chace.get(8)))
    var Rock_smash: Tiles = Tiles("Rock_Smash", arrayOf(conjunto_chace.get(3)))
    var Grass: Tiles = Tiles("Grass", arrayOf(conjunto_chace.get(9)))
    var Tall_Grass: Tiles = Tiles("Tall Grass", arrayOf(conjunto_chace.get(0), conjunto_chace.get(1), conjunto_chace.get(2)))

    var conjunto_tiles: Array<Tiles> = arrayOf(Old_Rod, Good_Rod, Great_Rod, Swimming, Rock_smash, Grass,
        Tall_Grass)

    //rotas

    

    //var Pallet_Town: Rota = Rota("Pallet Town", conjunto_tiles)

    return terreno
}