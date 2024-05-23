package com.example.pokedex1_2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //elementos (tem de tar aqui pq senão n funcionam)
        val texto = findViewById<TextView>(R.id.texto_teste)
        val apresentar_pokemon = findViewById<TextView>(R.id.present_pokemon)


        //---------------------------------------------------------------------------------

        //parte dos tipos

        var conjunto_tipos_nomes: Array<String> = arrayOf("Normal", "Fire", "Water", "Grass", "Electric", "Ice", "Fighting", "Poison", "Ground", "Flying", "Psychic", "Bug", "Rock", "Ghost", "Dragon", "Dark", "Steel", "Fairy")

        try {
            //texto.text = (R.string.app_name)
            //Toast.makeText(this, texto.text.toString(), Toast.LENGTH_LONG).show()

            var i = 0
            var texto_place_holder: String = ""

            for (valor in calcular_fraquezas()) {

                texto_place_holder += "${conjunto_tipos_nomes[i]}: $valor \n"
                texto.text = texto_place_holder


                i++
            }


        }
        catch (e: Exception) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show()
        }

        //apresentar os pokemons

        try {
            var texto_place_holder: String = ""

            // apresentar o nome da região
            texto_place_holder += "região: " + adicionar_pokemons().nome

            for (rota in adicionar_pokemons().rotas) {

                texto_place_holder += "\nrota: " + rota.nome

                apresentar_pokemon.text = texto_place_holder

                for (tile in rota.tiles) {

                    texto_place_holder += "\ncom: " + tile.nome

                    apresentar_pokemon.text = texto_place_holder

                    for (pokemons_possiveis in tile.pokemon_possiveis) {

                        texto_place_holder += "\nnome: " + pokemons_possiveis.nome.nome

                        apresentar_pokemon.text = texto_place_holder

                        texto_place_holder += "\nchance: " + pokemons_possiveis.chance
                        apresentar_pokemon.text = texto_place_holder
                    }
                }
            }
        }
        catch (e:Exception) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show()
        }
    }
}