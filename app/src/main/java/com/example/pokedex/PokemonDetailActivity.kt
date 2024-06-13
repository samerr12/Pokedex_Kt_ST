package com.example.pokedex

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.pokedex.Pokemon
import com.example.pokedex.R

class PokemonDetailActivity : AppCompatActivity() {

    private lateinit var pokemonImageView: ImageView
    private lateinit var pokemonNameTextView: TextView
    private lateinit var pokemonNumberTextView: TextView
    private lateinit var pokemonTypeLayout: LinearLayout

    // Stats
    private lateinit var hpProgressBar: ProgressBar
    private lateinit var hpValueTextView: TextView
    private lateinit var attackProgressBar: ProgressBar
    private lateinit var attackValueTextView: TextView
    private lateinit var defenseProgressBar: ProgressBar
    private lateinit var defenseValueTextView: TextView
    private lateinit var specialAttackProgressBar: ProgressBar
    private lateinit var specialAttackValueTextView: TextView
    private lateinit var specialDefenseProgressBar: ProgressBar
    private lateinit var specialDefenseValueTextView: TextView
    private lateinit var speedProgressBar: ProgressBar
    private lateinit var speedValueTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_detail)

        // Views Dos Pokemons
        pokemonImageView = findViewById(R.id.pokemonDetailImageView)
        pokemonNameTextView = findViewById(R.id.pokemonDetailNameTextView)
        pokemonNumberTextView = findViewById(R.id.pokemonDetailNumberTextView)
        pokemonTypeLayout = findViewById(R.id.pokemonDetailTypeLayout)

        // Stats
        hpProgressBar = findViewById(R.id.hpProgressBar)
        hpValueTextView = findViewById(R.id.hpValueTextView)
        attackProgressBar = findViewById(R.id.attackProgressBar)
        attackValueTextView = findViewById(R.id.attackValueTextView)
        defenseProgressBar = findViewById(R.id.defenseProgressBar)
        defenseValueTextView = findViewById(R.id.defenseValueTextView)
        specialAttackProgressBar = findViewById(R.id.specialAttackProgressBar)
        specialAttackValueTextView = findViewById(R.id.specialAttackValueTextView)
        specialDefenseProgressBar = findViewById(R.id.specialDefenseProgressBar)
        specialDefenseValueTextView = findViewById(R.id.specialDefenseValueTextView)
        speedProgressBar = findViewById(R.id.speedProgressBar)
        speedValueTextView = findViewById(R.id.speedValueTextView)

        // Botão De Voltar
        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            onBackPressed()
        }

        // Pega Dados Dos Pokemons
        val pokemonName = intent.getStringExtra("POKEMON_NAME") ?: ""
        val pokemonNumber = intent.getStringExtra("POKEMON_NUMBER") ?: ""
        val pokemonType = intent.getStringExtra("POKEMON_TYPE") ?: ""
        val pokemonImageResource = intent.getIntExtra("POKEMON_IMAGE", R.drawable.bulbasaur)
        val pokemonHp = intent.getIntExtra("POKEMON_HP", 0)
        val pokemonAttack = intent.getIntExtra("POKEMON_ATTACK", 0)
        val pokemonDefense = intent.getIntExtra("POKEMON_DEFENSE", 0)
        val pokemonSpecialAttack = intent.getIntExtra("POKEMON_SPECIAL_ATTACK", 0)
        val pokemonSpecialDefense = intent.getIntExtra("POKEMON_SPECIAL_DEFENSE", 0)
        val pokemonSpeed = intent.getIntExtra("POKEMON_SPEED", 0)

        pokemonImageView.setImageResource(pokemonImageResource)
        pokemonNameTextView.text = pokemonName
        pokemonNumberTextView.text = pokemonNumber

        val types = pokemonType.split("/")
        pokemonTypeLayout.removeAllViews()
        for (type in types) {
            val typeTextView = TextView(this).apply {
                text = type
                textSize = 16f
                setTextColor(ContextCompat.getColor(this@PokemonDetailActivity, android.R.color.black))
                val params = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                params.marginEnd = 8 // Margem entre tipos
                layoutParams = params
            }
            pokemonTypeLayout.addView(typeTextView)
        }

        // Update stats
        updateStatViews("HP", pokemonHp, hpProgressBar, hpValueTextView)
        updateStatViews("Attack", pokemonAttack, attackProgressBar, attackValueTextView)
        updateStatViews("Defense", pokemonDefense, defenseProgressBar, defenseValueTextView)
        updateStatViews("Special Attack", pokemonSpecialAttack, specialAttackProgressBar, specialAttackValueTextView)
        updateStatViews("Special Defense", pokemonSpecialDefense, specialDefenseProgressBar, specialDefenseValueTextView)
        updateStatViews("Speed", pokemonSpeed, speedProgressBar, speedValueTextView)

        setPokemonBackground(pokemonType)
        setPokemonTypeBackground(pokemonType)
    }

    private fun updateStatViews(statName: String, statValue: Int, progressBar: ProgressBar, textView: TextView) {
        textView.text = "$statName: $statValue"
        progressBar.progress = statValue
    }


    // Pega O Tipo Do Pokemon Para Colocar Background Automático. Caso Tenha 2 Tipos Escolhe O Primeiro
    private fun setPokemonBackground(pokemonType: String?) {
        pokemonType?.let {
            val primaryType = it.split("/")[0] // Separa Os Pokemons Pela "/"
            val backgroundResourceId = when (primaryType) {
                "Grass" -> R.drawable.gradientgrass
                "Poison" -> R.drawable.gradientpoison
                "Fire" -> R.drawable.gradientfire
                "Flying" -> R.drawable.gradientflying
                "Water" -> R.drawable.gradientwater
                "Bug" -> R.drawable.gradientbug
                "Normal" -> R.drawable.gradientnormal
                "Electric" -> R.drawable.gradientelectric
                "Ground" -> R.drawable.gradientground
                "Fairy" -> R.drawable.gradientfairy
                "Fight" -> R.drawable.gradientfight
                "Psychic" -> R.drawable.gradientpsychic
                "Rock" -> R.drawable.gradientrock
                "Steel" -> R.drawable.gradientsteel
                "Ice" -> R.drawable.gradientice
                "Ghost" -> R.drawable.gradientghost
                "Dragon" -> R.drawable.gradientdragon
                else -> R.drawable.background // Background Default Caso Tenha Um Tipo Que Não Exista
            }
            findViewById<LinearLayout>(R.id.pokemonDetailLayout).setBackgroundResource(backgroundResourceId)
        }
    }

    private fun setPokemonTypeBackground(pokemonType: String?) {
        pokemonType?.let {
            val types = it.split("/") // Separa Os Tipos "/"
            pokemonTypeLayout.removeAllViews()
            for (type in types) {
                val backgroundResourceId = getBackgroundResourceForType(type)
                val typeTextView = TextView(this).apply {
                    text = type
                    textSize = 20f
                    setTextColor(Color.WHITE)
                    setBackgroundResource(backgroundResourceId)
                    layoutParams = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    ).apply {
                        marginEnd = 8
                    }
                }
                pokemonTypeLayout.addView(typeTextView)
            }
        }
    }

    // Pega O Tipo Do Pokemon Para Colocar O Retangulo De Fundo
    private fun getBackgroundResourceForType(type: String): Int {
        return when (type) {
            "Grass" -> R.drawable.retangulo_grass
            "Poison" -> R.drawable.retangulo_poison
            "Fire" -> R.drawable.retangulo_fire
            "Flying" -> R.drawable.retangulo_flying
            "Water" -> R.drawable.retangulo_water
            "Bug" -> R.drawable.retangulo_bug
            "Normal" -> R.drawable.retangulo_normal
            "Electric" -> R.drawable.retangulo_electric
            "Ground" -> R.drawable.retangulo_ground
            "Fairy" -> R.drawable.retangulo_fairy
            "Fight" -> R.drawable.retangulo_fight
            "Psychic" -> R.drawable.retangulo_psychic
            "Rock" -> R.drawable.retangulo_rock
            "Steel" -> R.drawable.retangulo_steel
            "Ice" -> R.drawable.retangulo_ice
            "Ghost" -> R.drawable.retangulo_ghost
            "Dragon" -> R.drawable.retangulo_dragon
            else -> R.drawable.retangulo_grass // Background Default
        }
    }
}
