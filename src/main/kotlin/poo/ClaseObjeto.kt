package poo

import javax.swing.tree.AbstractLayoutCache

fun main() {
    val miCoche1 = Coche("azul",1570)
    val miCoche2 = Coche("rojo",-800)
    val miCoche3 = Coche("verde", 5000)
    val miCoche4 = Coche("Naranaja")
    val miCoche5 = Coche()
    val miCoche6 = Coche("Negro",3,0.6,1.2)
    println("El color del coche 1 es: ${miCoche1.color} y su peso es ${miCoche1.peso}" )
    println("El color del coche 2 es: ${miCoche2.color} y su peso es ${miCoche2.peso}" )
    println("El color del coche 3 es: ${miCoche3.color} y su peso es ${miCoche3.peso}" )
    println("El color del coche 4 es: ${miCoche4.color} y su peso es ${miCoche4.peso}" )
    println("El color del coche 5 es: ${miCoche5.color} y su peso es ${miCoche5.peso}" )
    println("Las dimensiones del coche 6 son: alto : ${miCoche6.alto},  ancho: ${miCoche6.ancho} ,largo: ${miCoche6.largo} y su color es ${miCoche6.color}")
    miCoche1.girar()
}

// Creamos clase
class Coche(var color:String, var peso:Int){
    // Init inicia junto con el construcctor

    init {
        if (peso < 0) {
            println("El peso no puede ser negativo")
            peso = 1500
        }
    }

    // Vamos a crear construcctor secundario

    constructor(color: String): this(color,1500)
    constructor():this("Blanco", 1500)
    constructor(color: String, largo: Int, ancho: Double, alto: Double):this(color,1500){
        this.largo = largo
        this.ancho = ancho
        this.alto = alto
    }

    // Creamos propiedades del objeto
   // var color:String = "azul"
    //var peso: Int = 1500
    var largo: Int = 2
    var ancho: Double = 0.5
    var alto: Double = 0.9

    // Creamos metodos o funciones
    fun acelerar(){
        println("Estoy acelerando")
    }
    fun frenar(){
        println("Estoy frenando")
    }
    fun girar(){
        println("Estoy girando...")
    }
}