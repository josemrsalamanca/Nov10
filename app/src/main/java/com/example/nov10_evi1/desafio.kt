package com.example.nov10_evi1

fun main(){
    imprimirNombre("jose","ramirez",29)
    devolverNombre("Jose")
}

fun imprimirNombre(nombre:String,apellido:String,edad:Int){
    println("El nombre comepleto es $nombre $apellido y la edad es $edad años")
}

fun devolverNombre(nombre: String){
    println("$nombre")
}

