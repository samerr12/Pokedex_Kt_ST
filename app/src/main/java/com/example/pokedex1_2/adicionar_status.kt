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
    var Cloud_Nine:Habilidade = Habilidade("Cloud_Nine", "Protective dust shields the Pokémon from the additional effects of moves.")
    var Compound_Eyes:Habilidade = Habilidade("Compound_Eyes", "The Pokémon sticks to its own tempo, preventing it from becoming confused or being affected by Intimidate.")
    var Insomnia:Habilidade = Habilidade("Insomnia", "The Pokémon uses suction cups to stay in one spot. This protects it from moves and items that would force it to switch out.")
    var Color_Change:Habilidade = Habilidade("Color_Change", "When the Pokémon enters a battle, it intimidates opposing Pokémon and makes them cower, lowering their Attack stats.")
    var Immunity:Habilidade = Habilidade("Immunity", "The Pokémon steps on the opposing Pokémon's shadows to prevent them from fleeing or switching out.")
    var Flash_Fire:Habilidade = Habilidade("Flash_Fire", "The Pokémon's rough skin damages attackers that make direct contact with it.")
    var Shield_Dust:Habilidade = Habilidade("Shield_Dust", "Its mysterious power only lets supereffective moves hit the Pokémon.")
    var Own_Tempo:Habilidade = Habilidade("Own_Tempo", "By floating in the air, the Pokémon receives full immunity to all Ground-type moves.")
    var Suction_Cups:Habilidade = Habilidade("Suction_Cups", "Contact with the Pokémon may inflict poison, sleep, or paralysis on the attacker.")
    var Intimidate:Habilidade = Habilidade("Intimidate", "If the Pokémon is burned, paralyzed, or poisoned by another Pokémon, that Pokémon will be inflicted with the same status condition.")
    var Shadow_Tag:Habilidade = Habilidade("Shadow_Tag", "Prevents other Pokémon's moves or Abilities from lowering the Pokémon's stats.")
    var Rough_Skin:Habilidade = Habilidade("Rough_Skin", "The Pokémon's status conditions are cured when it switches out.")
    var Wonder_Guard:Habilidade = Habilidade("Wonder_Guard", "The Pokémon draws in all Electric-type moves. Instead of taking damage from them, its Sp. Atk stat is boosted.")
    var Levitate:Habilidade = Habilidade("Levitate", "Raises the likelihood of additional effects occurring when the Pokémon uses its moves.")
    var Effect_Spore:Habilidade = Habilidade("Effect_Spore", "Boosts the Pokémon's Speed stat in rain.")
    var Synchronize:Habilidade = Habilidade("Synchronize", "Boosts the Pokémon's Speed stat in harsh sunlight.")
    var Clear_Body:Habilidade = Habilidade("Clear_Body", "By illuminating its surroundings, the Pokémon prevents its accuracy from being lowered.")
    var Natural_Cure:Habilidade = Habilidade("Natural_Cure", "When it enters a battle, the Pokémon copies an opposing Pokémon's Ability.")
    var Lightning_Rod:Habilidade = Habilidade("Lightning_Rod", "Doubles the Pokémon's Attack stat.")
    var Serene_Grace:Habilidade = Habilidade("Serene_Grace", "Contact with the Pokémon may poison the attacker.")
    var Swift_Swim:Habilidade = Habilidade("Swift_Swim", "The Pokémon's intense focus prevents it from flinching or being affected by Intimidate")
    var Chlorophyll:Habilidade = Habilidade("Chlorophyll", "The Pokémon's hot magma coating prevents it from being frozen.")
    var Illuminate:Habilidade = Habilidade("Illuminate", "The Pokémon's water veil prevents it from being burned.")
    var Trace:Habilidade = Habilidade("Trace", "Prevents Steel-type Pokémon from fleeing by pulling them in with magnetism.")
    var Huge_Power:Habilidade = Habilidade("Huge_Power", "Soundproofing gives the Pokémon full immunity to all sound-based moves.")
    var Poison_Point:Habilidade = Habilidade("Poison_Point", "The Pokémon gradually regains HP in rain.")
    var Inner_Focus:Habilidade = Habilidade("Inner_Focus", "The Pokémon summons a sandstorm when it enters a battle.")
    var Magma_Armor:Habilidade = Habilidade("Magma_Armor", "Puts other Pokémon under pressure, causing them to expend more PP to use their moves.")
    var Water_Veil:Habilidade = Habilidade("Water_Veil", "The Pokémon is protected by a layer of thick fat, which halves the damage taken from Fire- and Ice-type moves.")
    var Magnet_Pull:Habilidade = Habilidade("Magnet_Pull", "The Pokémon awakens from sleep twice as fast as other Pokémon.")
    var Soundproof:Habilidade = Habilidade("Soundproof", "Contact with the Pokémon may burn the attacker.")
    var Rain_Dish:Habilidade = Habilidade("Rain_Dish", "Enables a sure getaway from wild Pokémon.")
    var Sand_Stream:Habilidade = Habilidade("Sand_Stream", "The Pokémon's keen eyes prevent its accuracy from being lowered. It also ignores the target's stages in evasion.")
    var Pressure:Habilidade = Habilidade("Pressure", "Puts other Pokémon under pressure, causing them to expend more PP to use their moves.")
    var Thick_Fat:Habilidade = Habilidade("Thick_Fat", "The Pokémon is protected by a layer of thick fat, which halves the damage taken from Fire- and Ice-type moves.")
    var Early_Bird:Habilidade = Habilidade("Early_Bird", "The Pokémon awakens from sleep twice as fast as other Pokémon.")
    var Flame_Body:Habilidade = Habilidade("Flame_Body", "Contact with the Pokémon may burn the attacker.")
    var Run_Away:Habilidade = Habilidade("Run_Away", "Enables a sure getaway from wild Pokémon.")
    var Keen_Eye:Habilidade = Habilidade("Keen_Eye", "The Pokémon's keen eyes prevent its accuracy from being lowered. It also ignores the target's stages in evasion.")
    var Hyper_Cutter:Habilidade = Habilidade("Hyper_Cutter", "The Pokémon's prized, mighty pincers prevent other Pokémon from lowering its Attack stat.")
    var Pickup:Habilidade = Habilidade("Pickup", "The Pokémon may pick up an item another Pokémon used during a battle. It may pick up items outside of battle, too.")
    var Truant:Habilidade = Habilidade("Truant", "Each time the Pokémon uses a move, it spends the next turn loafing around.")
    var Hustle:Habilidade = Habilidade("Hustle", "Boosts the Pokémon's Attack stat but lowers its accuracy.")
    var Cute_Charm:Habilidade = Habilidade("Cute_Charm", "The Pokémon may infatuate attackers that make direct contact with it.")
    var Plus:Habilidade = Habilidade("Plus", "Boosts the Sp. Atk stat of the Pokémon if an ally with the Plus or Minus Ability is also in battle.")
    var Minus:Habilidade = Habilidade("Minus", "Boosts the Sp. Atk stat of the Pokémon if an ally with the Plus or Minus Ability is also in battle.")
    var Forecast:Habilidade = Habilidade("Forecast", "The Pokémon transforms with the weather to change its type to Water, Fire, or Ice.")
    var Sticky_Hold:Habilidade = Habilidade("Sticky_Hold", "The Pokémon's held items cling to its sticky body and cannot be removed by other Pokémon.")
    var Shed_Skin:Habilidade = Habilidade("Shed_Skin", "The Pokémon may cure its own status conditions by shedding its skin.")
    var Guts:Habilidade = Habilidade("Guts", "It's so gutsy that having a status condition boosts the Pokémon's Attack stat.")
    var Marvel_Scale:Habilidade = Habilidade("Marvel_Scale", "The Pokémon's marvelous scales boost its Defense stat if it has a status condition.")
    var Liquid_Ooze:Habilidade = Habilidade("Liquid_Ooze", "The strong stench of the Pokémon's oozed liquid damages attackers that use HP-draining moves.")
    var Overgrow:Habilidade = Habilidade("Overgrow", "Powers up Grass-type moves when the Pokémon's HP is low.")
    var Blaze:Habilidade = Habilidade("Blaze", "Powers up Fire-type moves when the Pokémon's HP is low.")
    var Torrent:Habilidade = Habilidade("Torrent", "Powers up Water-type moves when the Pokémon's HP is low.")
    var Swarm:Habilidade = Habilidade("Swarm", "Powers up Bug-type moves when the Pokémon's HP is low.")
    var Rock_Head:Habilidade = Habilidade("Rock_Head", "Protects the Pokémon from recoil damage.")
    var Drought:Habilidade = Habilidade("Drought", "Turns the sunlight harsh when the Pokémon enters a battle.")
    var Arena_Trap:Habilidade = Habilidade("Arena_Trap", "Prevents opposing Pokémon from fleeing from battle")
    var Vital_Spirit:Habilidade = Habilidade("Vital_Spirit", "The Pokémon is full of vitality, and that prevents it from falling asleep")

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

    //iniciais
    var p0: Status = Status(45, 49, 49, 65, 65, 45)
    var p1: Status = Status(60, 62, 63, 80, 80, 60)
    var p2: Status = Status(80, 82, 83, 100, 100, 80)
    var p3: Status = Status(39, 52, 43, 60, 50, 65)
    var p4: Status = Status(58, 64, 58, 80, 65, 80)
    var p5: Status = Status(78, 84, 78, 109, 85, 100)
    var p6: Status = Status(44, 48, 65, 50, 64, 43)
    var p7: Status = Status(59, 63, 80, 65, 80, 58)
    var p8: Status = Status(79, 83, 100, 85, 105, 78)
    //earlybugs (caterpie, weedle)
    var p9: Status = Status(45, 30, 35, 20, 20, 45)
    var p10: Status = Status(50, 20, 55, 25, 25, 30)
    var p11: Status = Status(60, 45, 50, 90, 80, 70)
    var p12: Status = Status(40,35,30,20,20,50)
    var p13: Status = Status(45,25,50,25,25,35)
    var p14: Status = Status(65,90,40,45,80,75)
    //pidgey
    var p15: Status = Status(40,45,40,35,35,56)
    var p16: Status = Status(63,60,55,50,50,71)
    var p17: Status = Status(83,80,75,70,70,101)
    //rattatta
    var p18: Status = Status(30,56,35,25,35,72)
    var p19: Status = Status(55,81,60,50,70,97)
    //spearow
    var p20: Status = Status(40,60,30,31,31,70)
    var p21: Status = Status(65,90,65,61,61,100)
    //eakens
    var p22: Status = Status(35,60,44,40,54,55)
    var p23: Status = Status(60,85,69,65,79,80)
    //pikachu
    var p24: Status = Status(35,55,40,50,50,90)
    var p25: Status = Status(60,90,55,90,80,110)
    //Sandshrew
    var p26: Status = Status(50,75,85,20,30,40)
    var p27: Status = Status(75,100,110,45,55,65)
    //nidorands
    var p28: Status = Status(55,47,52,40,40,41)
    var p29: Status = Status(70,62,67,55,55,56)
    var p30: Status = Status(90,92,87,75,85,76)
    var p31: Status = Status(46,57,40,40,40,50)
    var p32: Status = Status(61,72,57,55,55,65)
    var p33: Status = Status(81,102,77,85,75,85)
    //Clefairy
    var p34: Status = Status(70,45,48,60,65,35)
    var p35: Status = Status(95,70,73,95,90,60)
    //Vulpix
    var p36: Status = Status(38,41,40,50,65,65)
    var p37: Status = Status(73,76,75,81,100,100)
    //ninetales
    var p38: Status = Status(115,45,20,45,25,20)
    var p39: Status = Status(140,70,45,85,50,45)
    //Jigglypuff
    var p40: Status = Status(40,45,35,30,40,55)
    var p41: Status = Status(75,80,70,65,75,90)
    //Zubat
    var p42: Status = Status(45,50,55,75,65,30)
    var p43: Status = Status(60,65,70,85,75,40)
    //Oddish
    var p44: Status = Status(45,50,55,75,65,30)
    var p45: Status = Status(60,65,70,85,75,40)
    var p46: Status = Status(75,80,85,110,90,50)
    //paras
    var p47: Status = Status(35,70,55,45,55,25)
    var p48: Status = Status(60,95,80,60,80,30)
    //venonat
    var p49: Status = Status(60,55,50,40,55,45)
    var p50: Status = Status(70,65,60,90,75,90)


    var conjunto_stats = arrayOf(p0 ,p1, p2, p3, p4, p5, p6, p7, p8, p9,
        p10, p11, p12, p13, p14, p15, p16, p17, p18, p19,
        p20, p21, p22, p23, p24, p25, p26, p27, p28, p29,
        p30, p31, p32, p33, p34, p35, p36, p37, p38, p39,
        p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50)


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