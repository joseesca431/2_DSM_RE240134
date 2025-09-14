package com.example.desafio2_dsm

data class Estudiante(
    var id: String = "",
    var nombre: String = "",
    var edad: Int = 0,
    var direccion: String = "",
    var grado: String = "",
    var telefono: String = ""
) {
    // Constructor vacío requerido por Firebase
    constructor() : this("", "", 0, "", "", "")
}