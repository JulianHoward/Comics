package com.example.comics

import java.io.Serializable

class Comic(
    var id: Int,
    var nombre: String,
    var listaFotos: ArrayList<Int>
    ): Serializable{
    override fun toString(): String {
        return "$nombre"
    }
}
