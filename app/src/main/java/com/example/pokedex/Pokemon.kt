package com.example.pokedex

import android.os.Parcel
import android.os.Parcelable

data class Pokemon(
    val name: String,
    val id: String,
    val type: String,
    val imageResource: Int,
    val hp: Int,
    val attack: Int,
    val defense: Int,
    val specialAttack: Int,
    val specialDefense: Int,
    val speed: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(id)
        parcel.writeString(type)
        parcel.writeInt(imageResource)
        parcel.writeInt(hp)
        parcel.writeInt(attack)
        parcel.writeInt(defense)
        parcel.writeInt(specialAttack)
        parcel.writeInt(specialDefense)
        parcel.writeInt(speed)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pokemon> {
        override fun createFromParcel(parcel: Parcel): Pokemon {
            return Pokemon(parcel)
        }

        override fun newArray(size: Int): Array<Pokemon?> {
            return arrayOfNulls(size)
        }
    }
}
