package Ejercicio1

class Pelicula {
    var nombre:String=""
    var id_pelicula:Int
    var tematica:String=""

    constructor(nombre: String, id_pelicula: Int, tematica: String) {
        this.nombre = nombre
        this.id_pelicula = id_pelicula
        this.tematica = tematica
    }

    override fun toString(): String {
        return "Pelicula(Pelicula llamada '$nombre' cuyo id de pelicula es '$id_pelicula',cuya tematica es '$tematica')"
    }

}

fun main() {
    val peliculas = mutableListOf<Pelicula>()
    peliculas.add(Pelicula("Vengadores",0,"Heroes"))
    peliculas.add(Pelicula("Oppenheimer",1,"Física"))
    val SALIR=6
    var opcion:Int
    do {
        menu()
        opcion= readln().toInt()
    when(opcion){
        1->{
            anadirPelicula(peliculas)
        }
        2->{
            mostrarPeliculas(peliculas)
        }
        3->{
            buscarPelicula(peliculas)
        }
        4->{
            borrarPelicula(peliculas)
        }
        5->{
            editarPelicula(peliculas)
        }

    }

    }while(opcion!=SALIR)
}

fun anadirPelicula(peliculas: MutableList<Pelicula>){
    println("Nombre de la peli")
    var nombre= readln()
    println("ID de la peli")
    var id:Int= readln().toInt()
    println("Tematica")
    var tematica= readln()
    peliculas.add(Pelicula(nombre, id,tematica))
}
fun mostrarPeliculas(peliculas: MutableList<Pelicula>){
    for (value in peliculas){
        println(value)

    }
}
fun buscarPelicula(peliculas: MutableList<Pelicula>){

}
fun borrarPelicula(peliculas: MutableList<Pelicula>){

}
fun editarPelicula(peliculas: MutableList<Pelicula>){

}


fun menu(){
    println("1.Insertar pelicula")
    println("2.Mostrar pelicula")
    println("3.Buscar pelicula")
    println("4.Borrar pelicula")
    println("5.Editar pelicula")
    println("6.Salir")
}