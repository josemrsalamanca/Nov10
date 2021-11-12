package com.example.nov10_evi1


fun main(){
    // La variable creada toma el valor de la F(x) creada String.saludo
    val pepito = "saludo"
    pepito.saludo()
}

// La F(x) de extension se crea con el tipo de dato String se guido del nombre
fun String.saludo(){
    println("Hola")
}