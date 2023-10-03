fun main() {

    println("Hola Kotlin")

    //Variables

    var myString="Esto es una cadena de texto"
    println(myString)
    myString="Camavinga"

    var x=5
    //lista mutablent(no se puede añadir nada)
    var myList= listOf("hola","ei","Camavinga","cesar")
    println(myList[1])

    //Lista mutable
    var mylista = mutableListOf("eeeeeeeeeeee")
    mylista.add("cama")

    //sets
    val mySet = mutableSetOf("Camainga")
    println(mySet)
    mySet.add("Valdever")
    println(mySet)

    //mapas
    val myMap= mutableMapOf("Brais" to 36)
    println(myMap["Brais"])
    myMap["César"]=104
    println(myMap["César"])

    for (value in myMap){
        println(value)
    }

    myFuncion()

    var miClase=miClase("César",200)
    println(miClase.age)

    println("dime x")
    val p= readln()
    println("tu numero es "+p)
}

//funciones

fun myFuncion(){
    println("Esto es una funcion")
}


//clases

class miClase(val name:String,var age: Int){

}