package com.example.pokedex1_2

class Terreno_regiao (var nome:String ,var rotas: Array<Rota>) {

}

class Rota (var nome:String, var tiles: Array<Tiles>) {}

class Tiles (var nome: String, var pokemon_possiveis: Array<Pokemon_Tiled>) {}

class Pokemon_Tiled (var nome: Pokemon, var chance: Int = 0) {}