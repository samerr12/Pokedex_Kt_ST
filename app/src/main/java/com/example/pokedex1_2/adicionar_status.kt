package com.example.pokedex1_2



fun adicionar_habilidades(): Array<Habilidade> {

    var Stench:Habilidade = Habilidade("Stench", "By releasing a stench when attacking, the Pokémon may cause the target to flinch")
    var Drizzle:Habilidade = Habilidade("Drizzle", "The Pokémon makes it rain when it enters a battle.")
    var Speed_Boost:Habilidade = Habilidade("Speed_Boost", "The Pokémon's Speed stat is boosted every turn.")
    var Battle_Armor:Habilidade = Habilidade("Battle_Armor", "Hard armor protects the Pokémon from critical hits.")
    var Sturdy:Habilidade = Habilidade("Sturdy", "The Pokémon cannot be knocked out by a single hit as long as its HP is full. One-hit KO moves will also fail to knock it out.")
    var Damp:Habilidade = Habilidade("Damp", "The Pokémon dampens its surroundings, preventing all Pokémon from using explosive moves such as Self-Destruct.")
    var Limber:Habilidade = Habilidade("Limber", "The Pokémon's limber body prevents it from being paralyzed.")
    var Sand_Veil:Habilidade = Habilidade("Sand_Veil", "Boosts the Pokémon's evasiveness in a sandstorm.")
    var Static:Habilidade = Habilidade("Static", "The Pokémon is charged with static electricity and may paralyze attackers that make direct contact with it.")
    var Volt_Absorb:Habilidade = Habilidade("Volt_Absorb", "If hit by an Electric-type move, the Pokémon has its HP restored instead of taking damage.")
    var Water_Absorb:Habilidade = Habilidade("Water_Absorb", "If hit by a Water-type move, the Pokémon has its HP restored instead of taking damage")
    var Oblivious:Habilidade = Habilidade("Oblivious", "The Pokémon is oblivious, keeping it from being infatuated, falling for taunts, or being affected by Intimidate")
    var Cloud_Nine:Habilidade = Habilidade("Cloud_Nine", "")
    var Compound_Eyes:Habilidade = Habilidade("Compound_Eyes", "")
    var Insomnia:Habilidade = Habilidade("Insomnia", "")
    var Color_Change:Habilidade = Habilidade("Color_Change", "")
    var Immunity:Habilidade = Habilidade("Immunity", "")
    var Flash_Fire:Habilidade = Habilidade("Flash_Fire", "")
    var Shield_Dust:Habilidade = Habilidade("Shield_Dust", "")
    var Own_Tempo:Habilidade = Habilidade("Own_Tempo", "")
    var Suction_Cups:Habilidade = Habilidade("Suction_Cups", "")
    var Intimidate:Habilidade = Habilidade("Intimidate", "")
    var Shadow_Tag:Habilidade = Habilidade("Shadow_Tag", "")
    var Rough_Skin:Habilidade = Habilidade("Rough_Skin", "")
    var Wonder_Guard:Habilidade = Habilidade("", "")
    var Levitate:Habilidade = Habilidade("", "")
    var Effect_Spore:Habilidade = Habilidade("", "")
    var Synchronize:Habilidade = Habilidade("", "")
    var Clear_Body:Habilidade = Habilidade("", "")
    var Natural_Cure:Habilidade = Habilidade("", "")
    var Lightning_Rod:Habilidade = Habilidade("", "")
    var Serene_Grace:Habilidade = Habilidade("", "")
    var Swift_Swim:Habilidade = Habilidade("", "")
    var Chlorophyll:Habilidade = Habilidade("", "")
    var Illuminate:Habilidade = Habilidade("", "")
    var Trace:Habilidade = Habilidade("", "")
    var Huge_Power:Habilidade = Habilidade("", "")
    var Poison_Point:Habilidade = Habilidade("", "")
    var Inner_Focus:Habilidade = Habilidade("", "")
    var Magma_Armor:Habilidade = Habilidade("", "")
    var Water_Veil:Habilidade = Habilidade("Water_Veil", "")
    var Magnet_Pull:Habilidade = Habilidade("Magnet_Pull", "")
    var Soundproof:Habilidade = Habilidade("Soundproof", "")
    var Rain_Dish:Habilidade = Habilidade("Rain_Dish", "")
    var Sand_Stream:Habilidade = Habilidade("Sand_Stream", "")
    var Pressure:Habilidade = Habilidade("Pressure", "")
    var Thick_Fat:Habilidade = Habilidade("Thick_Fat", "")
    var Early_Bird:Habilidade = Habilidade("Early_Bird", "")
    var Flame_Body:Habilidade = Habilidade("Flame_Body", "")
    var Run_Away:Habilidade = Habilidade("Run_Away", "")
    var Keen_Eye:Habilidade = Habilidade("Keen_Eye", "")
    var Hyper_Cutter:Habilidade = Habilidade("Hyper_Cutter", "")
    var Pickup:Habilidade = Habilidade("Pickup", "")
    var Truant:Habilidade = Habilidade("Truant", "")
    var Hustle:Habilidade = Habilidade("Hustle", "")
    var Cute_Charm:Habilidade = Habilidade("Cute_Charm", "")
    var Plus:Habilidade = Habilidade("Plus", "")
    var Minus:Habilidade = Habilidade("Minus", "")
    var Forecast:Habilidade = Habilidade("Forecast", "")
    var Sticky_Hold:Habilidade = Habilidade("Sticky_Hold", "")
    var Shed_Skin:Habilidade = Habilidade("Shed_Skin", "")
    var Guts:Habilidade = Habilidade("Guts", "")
    var Marvel_Scale:Habilidade = Habilidade("Marvel_Scale", "")
    var Liquid_Ooze:Habilidade = Habilidade("Liquid_Ooze", "")
    var Overgrow:Habilidade = Habilidade("Overgrow", "")
    var Blaze:Habilidade = Habilidade("Blaze", "")
    var Torrent:Habilidade = Habilidade("Torrent", "")
    var Swarm:Habilidade = Habilidade("Swarm", "")
    var Rock_Head:Habilidade = Habilidade("Rock_Head", "")
    var Drought:Habilidade = Habilidade("Drought", "")
    var Arena_Trap:Habilidade = Habilidade("Arena_Trap", "")
    var Vital_Spirit:Habilidade = Habilidade("Vital_Spirit", "")

    var conjunto_habilidades = arrayOf(Stench, Drizzle, Speed_Boost, Battle_Armor, Sturdy, Damp, Limber, Sand_Veil, Static,
        Volt_Absorb, Water_Absorb, Oblivious, Cloud_Nine, Compound_Eyes, Insomnia, Color_Change, Immunity, Flash_Fire,
        Shield_Dust, Own_Tempo, Suction_Cups, Intimidate, Shadow_Tag, Rough_Skin, Wonder_Guard, Levitate, Effect_Spore,
        Synchronize, Clear_Body, Natural_Cure, Lightning_Rod, Serene_Grace, Swift_Swim, Chlorophyll, Illuminate, Trace,
        Huge_Power, Poison_Point, Inner_Focus, Magma_Armor, Water_Veil, Magnet_Pull, Soundproof, Rain_Dish, Sand_Stream, Pressure,
        Thick_Fat, Early_Bird, Flame_Body, Run_Away, Keen_Eye, Hyper_Cutter, Pickup, Truant, Hustle, Cute_Charm, Plus, Minus,
        Forecast, Sticky_Hold, Shed_Skin, Guts, Marvel_Scale, Liquid_Ooze, Overgrow, Blaze, Torrent, Swarm, Rock_Head,
        Drought, Arena_Trap, Vital_Spirit
    )

    return conjunto_habilidades
}

fun adicionar_status(): Array<Status> {

    var p1: Status = Status(45, 49, 49, 65, 65, 45)
    var p2: Status = Status(60, 62, 63, 80, 80, 60)
    var p3: Status = Status(80, 82, 83, 100, 100, 80)
    var p4: Status = Status(39, 52, 43, 60, 50, 65)
    var p5: Status = Status(58, 64, 58, 80, 65, 80)
    var p6: Status = Status(78, 84, 78, 109, 85, 100)

    var p7: Status = Status(78, 84, 78, 109, 85, 100)
    var p8: Status = Status(78, 84, 78, 109, 85, 100)
    var p9: Status = Status(78, 84, 78, 109, 85, 100)
    var p10: Status = Status(78, 84, 78, 109, 85, 100)

    var conjunto_stats = arrayOf(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)


    return conjunto_stats
}

fun adicionar_ovo(): Array<Grupo_ovos> {

    var Monster:Grupo_ovos = Grupo_ovos("Monster")
    var Human_like:Grupo_ovos = Grupo_ovos("Human-Like")
    var Water_1:Grupo_ovos = Grupo_ovos("Water_1")
    var Water_2:Grupo_ovos = Grupo_ovos("Water_2")
    var Water_3:Grupo_ovos = Grupo_ovos("Water_3")
    var Bug:Grupo_ovos = Grupo_ovos("Bug")
    var Mineral:Grupo_ovos = Grupo_ovos("Mineral")
    var Flying:Grupo_ovos = Grupo_ovos("Flying")
    var Amorphous:Grupo_ovos = Grupo_ovos("Amorphous")
    var Field:Grupo_ovos = Grupo_ovos("Field")
    var Fairy:Grupo_ovos = Grupo_ovos("Fairy")
    var Ditto:Grupo_ovos = Grupo_ovos("Ditto")
    var Grass:Grupo_ovos = Grupo_ovos("Grass")
    var Dragon:Grupo_ovos = Grupo_ovos("Dragon")
    var No_Discovered:Grupo_ovos = Grupo_ovos("No Eggs Discovered")
    var Unknown:Grupo_ovos = Grupo_ovos("Gender unknown")

    var conjunto_ovos = arrayOf(Monster, Human_like, Water_1, Water_2, Water_3, Bug, Mineral, Flying, Amorphous, Field,
        Fairy, Ditto, Grass, Dragon, No_Discovered, Unknown
    )

    return conjunto_ovos
}