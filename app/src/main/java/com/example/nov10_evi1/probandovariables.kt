package com.example.nov10_evi1

// Declarar 3 valores, más una extra de resultado. Imprimir
// Una de las variables mutables y volver a imprimir. Calcular promedio

fun main(){
    var a = 10
    val b = 33
    val c = 66

    var r = a +b + c
    var prom = r/3
    println("El resultado es: $r")
    println("El promedio es: $prom")

    a = 55
    r = a +b + c
    prom = r/3
    println("El resultado es: $r")
    println("El promedio es: $prom")

}


