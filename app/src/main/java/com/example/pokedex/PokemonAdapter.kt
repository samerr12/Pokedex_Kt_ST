import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.Pokemon
import com.example.pokedex.PokemonDetailActivity
import com.example.pokedex.R

class PokemonAdapter(private val pokemons: List<Pokemon>) : RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pokemon, parent, false)
        return PokemonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val pokemon = pokemons[position]
        holder.bind(pokemon)
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }

    inner class PokemonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        private val pokemonNameTextView: TextView = itemView.findViewById(R.id.pokemonNameTextView)
        private val pokemonNumberTextView: TextView = itemView.findViewById(R.id.pokemonNumberTextView)
        private val pokemonImageView: ImageView = itemView.findViewById(R.id.pokemonImageView)
        private val pokemonTypesLayout: LinearLayout = itemView.findViewById(R.id.pokemonTypesLayout)

        private lateinit var pokemon: Pokemon

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(pokemon: Pokemon) {
            this.pokemon = pokemon
            pokemonNameTextView.text = pokemon.name
            pokemonNumberTextView.text = pokemon.id
            pokemonImageView.setImageResource(pokemon.imageResource)

            pokemonTypesLayout.removeAllViews()

            val types = pokemon.type.split("/")
            for (type in types) {
                val typeTextView = TextView(itemView.context).apply {
                    text = type
                    textSize = 16f
                    setTextColor(ContextCompat.getColor(itemView.context, android.R.color.black))
                    background = ContextCompat.getDrawable(itemView.context, getBackgroundResourceForType(type))
                    val params = LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                    )
                    params.marginEnd = 8 // Margem Entre Tipos
                    layoutParams = params
                }
                pokemonTypesLayout.addView(typeTextView)
            }
        }

        // Ao Clicar Num Dos Pokemons Da Lista Pega Os Dados
        override fun onClick(v: View?) {
            val context = itemView.context
            val intent = Intent(context, PokemonDetailActivity::class.java).apply {
                putExtra("POKEMON_NAME", pokemon.name)
                putExtra("POKEMON_NUMBER", pokemon.id)
                putExtra("POKEMON_TYPE", pokemon.type)
                putExtra("POKEMON_IMAGE", pokemon.imageResource)
                putExtra("POKEMON_HP", pokemon.hp)
                putExtra("POKEMON_ATTACK", pokemon.attack)
                putExtra("POKEMON_DEFENSE", pokemon.defense)
                putExtra("POKEMON_SPECIAL_ATTACK", pokemon.specialAttack)
                putExtra("POKEMON_SPECIAL_DEFENSE", pokemon.specialDefense)
                putExtra("POKEMON_SPEED", pokemon.speed)
            }
            context.startActivity(intent)
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
                else -> R.drawable.retangulo_grass // Caso Falhe Coloca Este Retângulo
            }
        }
    }
}
