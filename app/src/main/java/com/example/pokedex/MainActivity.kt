package com.example.pokedex

import PokemonAdapter
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        searchEditText = findViewById(R.id.searchEditText)

        val pokemons = createDummyPokemons()
        val adapter = PokemonAdapter(pokemons)

        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.adapter = adapter
    }

    private fun createDummyPokemons(): List<Pokemon> {
        val pokemons = mutableListOf<Pokemon>()

        // Lista De Pokemons
        val pokemonData = listOf(
            Pokemon("Bulbasaur", "#001", "Grass/Poison", R.drawable.bulbasaur, 45, 49, 49, 65, 65, 45),
            Pokemon("Ivysaur", "#002", "Grass/Poison", R.drawable.ivysaur, 60, 62, 63, 80, 80, 60),
            Pokemon("Venusaur", "#003", "Grass/Poison", R.drawable.venusaur, 80, 82, 83, 100, 100, 80),
            Pokemon("Charmander", "#004", "Fire", R.drawable.charmander, 39, 52, 43, 60, 50, 65),
            Pokemon("Charmeleon", "#005", "Fire", R.drawable.charmeleon, 58, 64, 58, 80, 65, 80),
            Pokemon("Charizard", "#006", "Fire/Flying", R.drawable.charizard, 78, 84, 78, 109, 85, 100),
            Pokemon("Squirtle", "#007", "Water", R.drawable.squirtle, 44, 48, 65, 50, 64, 43),
            Pokemon("Wartortle", "#008", "Water", R.drawable.wartortle, 59, 63, 80, 65, 80, 58),
            Pokemon("Blastoise", "#009", "Water", R.drawable.blastoise, 79, 83, 100, 85, 105, 78),
            Pokemon("Caterpie", "#010", "Bug", R.drawable.caterpie, 45, 30, 35, 20, 20, 45),
            Pokemon("Metapod", "#011", "Bug", R.drawable.metapod, 50, 20, 55, 25, 25, 30),
            Pokemon("Butterfree", "#012", "Bug/Flying", R.drawable.butterfree, 60, 45, 50, 90, 80, 70),
            Pokemon("Weedle", "#013", "Bug/Poison", R.drawable.weedle, 40, 35, 30, 20, 20, 50),
            Pokemon("Kakuna", "#014", "Bug/Poison", R.drawable.kakuna, 45, 25, 50, 25, 25, 35),
            Pokemon("Beedrill", "#015", "Bug/Poison", R.drawable.beedrill, 65, 90, 40, 45, 80, 75),
            Pokemon("Pidgey", "#016", "Normal/Flying", R.drawable.pidgey, 40, 45, 40, 35, 35, 56),
            Pokemon("Pidgeotto", "#017", "Normal/Flying", R.drawable.pidgeotto, 63, 60, 55, 50, 50, 71),
            Pokemon("Pidgeot", "#018", "Normal/Flying", R.drawable.pidgeot, 83, 80, 75, 70, 70, 101),
            Pokemon("Rattata", "#019", "Normal", R.drawable.rattata, 30, 56, 35, 25, 35, 72),
            Pokemon("Raticate", "#020", "Normal", R.drawable.raticate, 55, 81, 60, 50, 70, 97),
            Pokemon("Spearow", "#021", "Normal/Flying", R.drawable.spearow, 40, 60, 30, 31, 31, 70),
            Pokemon("Fearow", "#022", "Normal/Flying", R.drawable.fearow, 65, 90, 65, 61, 61, 100),
            Pokemon("Ekans", "#023", "Poison", R.drawable.ekans, 35, 60, 44, 40, 54, 55),
            Pokemon("Arbok", "#024", "Poison", R.drawable.arbok, 60, 85, 69, 65, 79, 80),
            Pokemon("Pikachu", "#025", "Electric", R.drawable.pikachu, 35, 55, 40, 50, 50, 90),
            Pokemon("Raichu", "#026", "Electric", R.drawable.raichu, 60, 90, 55, 90, 80, 110),
            Pokemon("Sandshrew", "#027", "Ground", R.drawable.sandshrew, 50, 75, 85, 20, 30, 40),
            Pokemon("Sandslash", "#028", "Ground", R.drawable.sandslash, 75, 100, 110, 45, 55, 65),
            Pokemon("Nidoran♀", "#029", "Poison", R.drawable.nidoranf, 55, 47, 52, 40, 40, 41),
            Pokemon("Nidorina", "#030", "Poison", R.drawable.nidorina, 70, 62, 67, 55, 55, 56),
            Pokemon("Nidoqueen", "#031", "Poison/Ground", R.drawable.nidoqueen, 90, 92, 87, 75, 85, 76),
            Pokemon("Nidoran♂", "#032", "Poison", R.drawable.nidoranm, 46, 57, 40, 40, 40, 50),
            Pokemon("Nidorino", "#033", "Poison", R.drawable.nidorino, 61, 72, 57, 55, 55, 65),
            Pokemon("Nidoking", "#034", "Poison/Ground", R.drawable.nidoking, 81, 102, 77, 85, 75, 85),
            Pokemon("Clefairy", "#035", "Fairy", R.drawable.clefairy, 70, 45, 48, 60, 65, 35),
            Pokemon("Clefable", "#036", "Fairy", R.drawable.clefable, 95, 70, 73, 95, 90, 60),
            Pokemon("Vulpix", "#037", "Fire", R.drawable.vulpix, 38, 41, 40, 50, 65, 65),
            Pokemon("Ninetales", "#038", "Fire", R.drawable.ninetales, 73, 76, 75, 81, 100, 100),
            Pokemon("Jigglypuff", "#039", "Normal/Fairy", R.drawable.jigglypuff, 115, 45, 20, 45, 25, 20),
            Pokemon("Wigglytuff", "#040", "Normal/Fairy", R.drawable.wigglytuff, 140, 70, 45, 85, 50, 45),
            Pokemon("Zubat", "#041", "Poison/Flying", R.drawable.zubat, 40, 45, 35, 30, 40, 55),
            Pokemon("Golbat", "#042", "Poison/Flying", R.drawable.golbat, 75, 80, 70, 65, 75, 90),
            Pokemon("Oddish", "#043", "Grass/Poison", R.drawable.oddish, 45, 50, 55, 75, 65, 30),
            Pokemon("Gloom", "#044", "Grass/Poison", R.drawable.gloom, 60, 65, 70, 85, 75, 40),
            Pokemon("Vileplume", "#045", "Grass/Poison", R.drawable.vileplume, 75, 80, 85, 110, 90, 50),
            Pokemon("Paras", "#046", "Bug/Grass", R.drawable.paras, 35, 70, 55, 45, 55, 25),
            Pokemon("Parasect", "#047", "Bug/Grass", R.drawable.parasect, 60, 95, 80, 60, 80, 30),
            Pokemon("Venonat", "#048", "Bug/Poison", R.drawable.venonat, 60, 55, 50, 40, 55, 45),
            Pokemon("Venomoth", "#049", "Bug/Poison", R.drawable.venomoth, 70, 65, 60, 90, 75, 90),
            Pokemon("Diglett", "#050", "Ground", R.drawable.diglett, 10, 55, 25, 35, 45, 95),
            Pokemon("Dugtrio", "#051", "Ground", R.drawable.dugtrio, 35, 80, 50, 50, 70, 120),
            Pokemon("Meowth", "#052", "Normal", R.drawable.meowth, 40, 45, 35, 40, 40, 90),
            Pokemon("Persian", "#053", "Normal", R.drawable.persian, 65, 70, 60, 65, 65, 115),
            Pokemon("Psyduck", "#054", "Water", R.drawable.psyduck, 50, 52, 48, 65, 50, 55),
            Pokemon("Golduck", "#055", "Water", R.drawable.golduck, 80, 82, 78, 95, 80, 85),
            Pokemon("Mankey", "#056", "Fighting", R.drawable.mankey, 40, 80, 35, 35, 45, 70),
            Pokemon("Primeape", "#057", "Fighting", R.drawable.primeape, 65, 105, 60, 60, 70, 95),
            Pokemon("Growlithe", "#058", "Fire", R.drawable.growlithe, 55, 70, 45, 70, 50, 60),
            Pokemon("Arcanine", "#059", "Fire", R.drawable.arcanine, 90, 110, 80, 100, 80, 95),
            Pokemon("Poliwag", "#060", "Water", R.drawable.poliwag, 40, 50, 40, 40, 40, 90),
            Pokemon("Poliwhirl", "#061", "Water", R.drawable.poliwhirl, 65, 65, 65, 50, 50, 90),
            Pokemon("Poliwrath", "#062", "Water/Fighting", R.drawable.poliwrath, 90, 85, 95, 70, 90, 70),
            Pokemon("Abra", "#063", "Psychic", R.drawable.abra, 25, 20, 15, 105, 55, 90),
            Pokemon("Kadabra", "#064", "Psychic", R.drawable.kadabra, 40, 35, 30, 120, 70, 105),
            Pokemon("Alakazam", "#065", "Psychic", R.drawable.alakazam, 55, 50, 45, 135, 95, 120),
            Pokemon("Machop", "#066", "Fighting", R.drawable.machop, 70, 80, 50, 35, 35, 35),
            Pokemon("Machoke", "#067", "Fighting", R.drawable.machoke, 80, 100, 70, 50, 60, 45),
            Pokemon("Machamp", "#068", "Fighting", R.drawable.machamp, 90, 130, 80, 65, 85, 55),
            Pokemon("Bellsprout", "#069", "Grass/Poison", R.drawable.bellsprout, 50, 75, 35, 70, 30, 40),
            Pokemon("Weepinbell", "#070", "Grass/Poison", R.drawable.weepinbell, 65, 90, 50, 85, 45, 55),
            Pokemon("Victreebel", "#071", "Grass/Poison", R.drawable.victreebel, 80, 105, 65, 100, 60, 70),
            Pokemon("Tentacool", "#072", "Water/Poison", R.drawable.tentacool, 40, 40, 35, 50, 100, 70),
            Pokemon("Tentacruel", "#073", "Water/Poison", R.drawable.tentacruel, 80, 70, 65, 80, 120, 100),
            Pokemon("Geodude", "#074", "Rock/Ground", R.drawable.geodude, 40, 80, 100, 30, 30, 20),
            Pokemon("Graveler", "#075", "Rock/Ground", R.drawable.graveler, 55, 95, 115, 45, 45, 35),
            Pokemon("Golem", "#076", "Rock/Ground", R.drawable.golem, 80, 120, 130, 55, 65, 45),
            Pokemon("Ponyta", "#077", "Fire", R.drawable.ponyta, 50, 85, 55, 65, 65, 90),
            Pokemon("Rapidash", "#078", "Fire", R.drawable.rapidash, 65, 100, 70, 80, 80, 105),
            Pokemon("Slowpoke", "#079", "Water/Psychic", R.drawable.slowpoke, 90, 65, 65, 40, 40, 15),
            Pokemon("Slowbro", "#080", "Water/Psychic", R.drawable.slowbro, 95, 75, 110, 100, 80, 30),
            Pokemon("Magnemite", "#081", "Electric/Steel", R.drawable.magnemite, 25, 35, 70, 95, 55, 45),
            Pokemon("Magneton", "#082", "Electric/Steel", R.drawable.magneton, 50, 60, 95, 120, 70, 70),
            Pokemon("Farfetch'd", "#083", "Normal/Flying", R.drawable.farfetchd, 52, 90, 55, 58, 62, 60),
            Pokemon("Doduo", "#084", "Normal/Flying", R.drawable.doduo, 35, 85, 45, 35, 35, 75),
            Pokemon("Dodrio", "#085", "Normal/Flying", R.drawable.dodrio, 60, 110, 70, 60, 60, 110),
            Pokemon("Seel", "#086", "Water", R.drawable.seel, 65, 45, 55, 45, 70, 45),
            Pokemon("Dewgong", "#087", "Water/Ice", R.drawable.dewgong, 90, 70, 80, 70, 95, 70),
            Pokemon("Grimer", "#088", "Poison", R.drawable.grimer, 80, 80, 50, 40, 50, 25),
            Pokemon("Muk", "#089", "Poison", R.drawable.muk, 105, 105, 75, 65, 100, 50),
            Pokemon("Shellder", "#090", "Water", R.drawable.shellder, 30, 65, 100, 45, 25, 40),
            Pokemon("Cloyster", "#091", "Water/Ice", R.drawable.cloyster, 50, 95, 180, 85, 45, 70),
            Pokemon("Gastly", "#092", "Ghost/Poison", R.drawable.gastly, 30, 35, 30, 100, 35, 80),
            Pokemon("Haunter", "#093", "Ghost/Poison", R.drawable.haunter, 45, 50, 45, 115, 55, 95),
            Pokemon("Gengar", "#094", "Ghost/Poison", R.drawable.gengar, 60, 65, 60, 130, 75, 110),
            Pokemon("Onix", "#095", "Rock/Ground", R.drawable.onix, 35, 45, 160, 30, 45, 70),
            Pokemon("Drowzee", "#096", "Psychic", R.drawable.drowzee, 60, 48, 45, 43, 90, 42),
            Pokemon("Hypno", "#097", "Psychic", R.drawable.hypno, 85, 73, 70, 73, 115, 67),
            Pokemon("Krabby", "#098", "Water", R.drawable.krabby, 30, 105, 90, 25, 25, 50),
            Pokemon("Kingler", "#099", "Water", R.drawable.kingler, 55, 130, 115, 50, 50, 75),
            Pokemon("Voltorb", "#100", "Electric", R.drawable.voltorb, 40, 30, 50, 55, 55, 100),
            Pokemon("Electrode", "#101", "Electric", R.drawable.electrode, 60, 50, 70, 80, 80, 150),
            Pokemon("Exeggcute", "#102", "Grass/Psychic", R.drawable.exeggcute, 60, 40, 80, 60, 45, 40),
            Pokemon("Exeggutor", "#103", "Grass/Psychic", R.drawable.exeggutor, 95, 95, 85, 125, 75, 55),
            Pokemon("Cubone", "#104", "Ground", R.drawable.cubone, 50, 50, 95, 40, 50, 35),
            Pokemon("Marowak", "#105", "Ground", R.drawable.marowak, 60, 80, 110, 50, 80, 45),
            Pokemon("Hitmonlee", "#106", "Fighting", R.drawable.hitmonlee, 50, 120, 53, 35, 110, 87),
            Pokemon("Hitmonchan", "#107", "Fighting", R.drawable.hitmonchan, 50, 105, 79, 35, 110, 76),
            Pokemon("Lickitung", "#108", "Normal", R.drawable.lickitung, 90, 55, 75, 60, 75, 30),
            Pokemon("Koffing", "#109", "Poison", R.drawable.koffing, 40, 65, 95, 60, 45, 35),
            Pokemon("Weezing", "#110", "Poison", R.drawable.weezing, 65, 90, 120, 85, 70, 60),
            Pokemon("Rhyhorn", "#111", "Ground/Rock", R.drawable.rhyhorn, 80, 85, 95, 30, 30, 25),
            Pokemon("Rhydon", "#112", "Ground/Rock", R.drawable.rhydon, 105, 130, 120, 45, 45, 40),
            Pokemon("Chansey", "#113", "Normal", R.drawable.chansey, 250, 5, 5, 35, 105, 50),
            Pokemon("Tangela", "#114", "Grass", R.drawable.tangela, 65, 55, 115, 100, 40, 60),
            Pokemon("Kangaskhan", "#115", "Normal", R.drawable.kangaskhan, 105, 95, 80, 40, 80, 90),
            Pokemon("Horsea", "#116", "Water", R.drawable.horsea, 30, 40, 70, 70, 25, 60),
            Pokemon("Seadra", "#117", "Water", R.drawable.seadra, 55, 65, 95, 95, 45, 85),
            Pokemon("Goldeen", "#118", "Water", R.drawable.goldeen, 45, 67, 60, 35, 50, 63),
            Pokemon("Seaking", "#119", "Water", R.drawable.seaking, 80, 92, 65, 65, 80, 68),
            Pokemon("Staryu", "#120", "Water", R.drawable.staryu, 30, 45, 55, 70, 55, 85),
            Pokemon("Starmie", "#121", "Water/Psychic", R.drawable.starmie, 60, 75, 85, 100, 85, 115),
            Pokemon("Mr. Mime", "#122", "Psychic/Fairy", R.drawable.mrmime, 40, 45, 65, 100, 120, 90),
            Pokemon("Scyther", "#123", "Bug/Flying", R.drawable.scyther, 70, 110, 80, 55, 80, 105),
            Pokemon("Jynx", "#124", "Ice/Psychic", R.drawable.jynx, 65, 50, 35, 115, 95, 95),
            Pokemon("Electabuzz", "#125", "Electric", R.drawable.electabuzz, 65, 83, 57, 95, 85, 105),
            Pokemon("Magmar", "#126", "Fire", R.drawable.magmar, 65, 95, 57, 100, 85, 93),
            Pokemon("Pinsir", "#127", "Bug", R.drawable.pinsir, 65, 125, 100, 55, 70, 85),
            Pokemon("Tauros", "#128", "Normal", R.drawable.tauros, 75, 100, 95, 40, 70, 110),
            Pokemon("Magikarp", "#129", "Water", R.drawable.magikarp, 20, 10, 55, 15, 20, 80),
            Pokemon("Gyarados", "#130", "Water/Flying", R.drawable.gyarados, 95, 125, 79, 60, 100, 81),
            Pokemon("Lapras", "#131", "Water/Ice", R.drawable.lapras, 130, 85, 80, 85, 95, 60),
            Pokemon("Ditto", "#132", "Normal", R.drawable.ditto, 48, 48, 48, 48, 48, 48),
            Pokemon("Eevee", "#133", "Normal", R.drawable.eevee, 55, 55, 50, 45, 65, 55),
            Pokemon("Vaporeon", "#134", "Water", R.drawable.vaporeon, 130, 65, 60, 110, 95, 65),
            Pokemon("Jolteon", "#135", "Electric", R.drawable.jolteon, 65, 65, 60, 110, 95, 130),
            Pokemon("Flareon", "#136", "Fire", R.drawable.flareon, 65, 130, 60, 95, 110, 65),
            Pokemon("Porygon", "#137", "Normal", R.drawable.porygon, 65, 60, 70, 85, 75, 40),
            Pokemon("Omanyte", "#138", "Rock/Water", R.drawable.omanyte, 35, 40, 100, 90, 55, 35),
            Pokemon("Omastar", "#139", "Rock/Water", R.drawable.omastar, 70, 60, 125, 115, 70, 55),
            Pokemon("Kabuto", "#140", "Rock/Water", R.drawable.kabuto, 30, 80, 90, 55, 45, 55),
            Pokemon("Kabutops", "#141", "Rock/Water", R.drawable.kabutops, 60, 115, 105, 65, 70, 80),
            Pokemon("Aerodactyl", "#142", "Rock/Flying", R.drawable.aerodactyl, 80, 105, 65, 60, 75, 130),
            Pokemon("Snorlax", "#143", "Normal", R.drawable.snorlax, 160, 110, 65, 65, 110, 30),
            Pokemon("Articuno", "#144", "Ice/Flying", R.drawable.articuno, 90, 85, 100, 95, 125, 85),
            Pokemon("Zapdos", "#145", "Electric/Flying", R.drawable.zapdos, 90, 90, 85, 125, 90, 100),
            Pokemon("Moltres", "#146", "Fire/Flying", R.drawable.moltres, 90, 100, 90, 125, 85, 90),
            Pokemon("Dratini", "#147", "Dragon", R.drawable.dratini, 41, 64, 45, 50, 50, 50),
            Pokemon("Dragonair", "#148", "Dragon", R.drawable.dragonair, 61, 84, 65, 70, 70, 70),
            Pokemon("Dragonite", "#149", "Dragon/Flying", R.drawable.dragonite, 91, 134, 95, 100, 100, 80),
            Pokemon("Mewtwo", "#150", "Psychic", R.drawable.mewtwo, 106, 110, 90, 154, 90, 130),
            Pokemon("Mew", "#151", "Psychic", R.drawable.mew, 100, 100, 100, 100, 100, 100),
        )



        pokemons.addAll(pokemonData)

        return pokemons
    }
}
