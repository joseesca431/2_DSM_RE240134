package com.example.desafio2_dsm

data class Nota(
    var id: String = "",
    var estudianteId: String = "",
    var nombreEstudiante: String = "",
    var grado: String = "",
    var materia: String = "",
    var notaFinal: Double = 0.0
) {
    // Constructor vacío requerido por Firebase
    constructor() : this("", "", "", "", "", 0.0)
}
