package com.example.nov10_evi1

class Funciones {
}


fun main(){
//llamando a una funcion
    val x = "santiago"
    val template= "La palabra tiene ${x.count()} caracteres"
    println(template)


//Modificar el valor de una variable "mutable" e imprimirlo por pantalla
    val a = "Goku"
    var e = "Vegeta"
    e=  "Piccolo"

    println("Primer personaje $a y el segundo personaje $e")

//ver el valor maximo de un tipo numerico, ejemplo byte
    val byteMaximo = Byte.MAX_VALUE
    println("El maximo valor de un byte es: $byteMaximo")

//ver el valor minimo de un tipo numerico
    val byteMinimo =Byte.MIN_VALUE
    println("El minimo valor de un byte es: $byteMinimo")
}





