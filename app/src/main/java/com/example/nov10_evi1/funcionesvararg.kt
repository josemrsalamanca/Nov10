package com.example.nov10_evi1


fun main(){
    //En el main llamo la F(x) creada
    printMessageWithPrefix("Hola mundo")
    printMessage("Hola")
    println(sumar(5,9))
    println(imprimirVarios("Hello, Hallo, Salut, Hola", prefix = "Idiomas "))
}


// Una F(x) debe comenzar con fun + nombre + () + parametros dentro de () + tipo de retorno
fun printMessageWithPrefix(message: String, prefix: String = "Primer saludo") {
    println("[$prefix] $message")
}

fun printMessage(message: String){ // 1
    println(message)
}

fun sumar(x:Int , y : Int):Int{
    return x + y
}


// Varag permite recibir varios argumentos
fun imprimirVarios(vararg saludo:String, prefix: String){
    for(m in saludo)
        println(prefix + m)
}
