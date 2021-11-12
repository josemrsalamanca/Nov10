package com.example.nov10_evi1
//Para las variables se necesitan 3 cosas
//Tipo de variable
//Nombre de la variable
//Tipo de valor

fun main(){
    //Aca se encuentrar los requisitos, adicional de que es mutable
    var numero = 10
    val numero2 = 20

    println("El valor 1: $numero")
    println("El valor 2: $numero2")

    numero = 50
    println("El nuevo valor de 1: $numero")

    //Para string idem
    var nombre = "jose"
    val nombre2 = "miguel"

    println("El nombre 1: $nombre")
    println("El nombre 2: $nombre2")

    nombre = "juan"
    println("El nuevo nombre 1: $nombre")
}
