package com.example.pokedex1_2

fun calcular_fraquezas(): Array<Double> {

    var tipos_escolhido: Array<String> = arrayOf("Ground", "Poison")

    //uma coleção de tipos
    var conjunto_tipos_nomes: Array<String>
    var conjunto_tipos_valores: Array<Double>

    //variaveis para poder armazenar qual é o nivel de resistencia do tipo
    var Normal: Double = 1.0
    var Fire: Double = 1.0
    var Water: Double = 1.0
    var Grass: Double = 1.0
    var Electric: Double = 1.0
    var Ice: Double = 1.0
    var Fighting: Double = 1.0
    var Poison: Double = 1.0
    var Ground: Double = 1.0
    var Flying: Double = 1.0
    var Psychic: Double = 1.0
    var Bug: Double = 1.0
    var Rock: Double = 1.0
    var Ghost: Double = 1.0
    var Dragon: Double = 1.0
    var Dark: Double = 1.0
    var Steel: Double = 1.0
    var Fairy: Double = 1.0


    for (tipo in tipos_escolhido) {

        var indice: Int = 0

        when (tipo) {

            "Normal" -> {Fighting *= 2; Ghost *= 0}

            "Fire" -> {Fire *= 0.5; Water *= 2; Grass *= 0.5; Ice *= 0.5; Ground *= 2; Bug *= 0.5; Rock *= 2; Steel *= 0.5; Fairy *= 0.5}

            "Water" -> {Fire *= 0.5; Water *= 0.5; Grass *= 2; Electric *= 2; Ice *= 0.5; Steel *= 0.5}

            "Grass" -> {Fire *= 2; Water *= 0.5; Grass *= 0.5; Electric *= 0.5; Ice *= 2; Poison *= 2; Ground *= 0.5; Flying *= 2; Bug *= 2}

            "Electric" -> {Electric *= 0.5; Ground *= 2; Flying *= 0.5; Steel *= 0.5}

            "Ice" -> {Fire *= 2; Ice *= 0.5; Fighting *= 2; Rock *= 2; Steel *= 2}

            "Fighting" -> {Normal *= 2; Flying *= 2; Psychic *= 2; Bug *= 0.5; Rock *= 0.5; Dark *= 0.5; Fairy *= 2}

            "Poison" -> {Grass *= 0.5; Fighting *= 0.5; Poison *= 0.5; Ground *= 2; Psychic *= 2; Bug *= 0.5; Fairy *= 0.5}

            "Ground" -> {Water *= 2; Grass *= 2; Electric *= 0; Ice *= 2; Poison *= 0.5; Rock *= 0.5}

            "Flying" -> {Grass *= 0.5; Electric *= 2; Ice *= 2; Fighting *= 0.5; Ground *= 2; Bug *= 0.5; Rock *= 2}

            "Psychic" -> {Fighting *= 0.5; Psychic *= 0.5; Bug *= 2; Ghost *= 2; Dark *= 2}

            "Bug" -> {Fire *= 2; Grass *= 0.5; Fighting *= 0.5; Ground *= 0.5; Flying *= 2; Rock *= 2}

            "Rock" -> {Normal *= 0.5; Fire *= 0.5; Water *= 2; Grass *= 2; Fighting *= 2; Poison *= 0.5; Ground *= 2; Flying *= 0.5; Steel *= 2}

            "Ghost" -> {Normal *= 0; Fighting *= 0; Poison *= 0.5; Bug *= 0.5; Ghost *= 2; Dark *= 2}

            "Dragon" -> {Fire *= 0.5; Water *= 0.5; Grass *= 0.5; Electric *= 0.5; Ice *= 2; Dragon *= 2; Fairy *= 2}

            "Dark" -> {Fighting *= 2; Psychic *= 0; Bug *= 2; Ghost *= 0.5; Dark *= 0.5; Fairy *= 2}

            "Steel" -> {Normal *= 0.5; Fire *= 2; Grass *= 0.5; Ice *= 0.5; Fighting *= 2; Poison *= 0; Ground *= 2; Flying *= 0.5; Psychic *= 0.5; Bug *= 0.5; Rock *= 0.5; Dragon *= 0.5; Steel *= 0.5; Fairy *= 0.5}

            "Fairy" -> {Fighting *= 0.5; Poison *= 2; Bug *= 0.5; Dragon *= 0; Dark *= 0.5; Steel *= 2}
        }

    }

    conjunto_tipos_nomes = arrayOf("Normal", "Fire", "Water", "Grass", "Electric")
    conjunto_tipos_valores = arrayOf(Normal, Fire, Water, Grass, Electric, Ice, Fighting, Poison, Ground, Flying, Psychic, Bug, Rock, Ghost, Dragon, Dark, Steel, Fairy)

    return conjunto_tipos_valores
}