package poo

fun main() {
    val miCoche1 = Coche()
    println("El color del coche es: ${miCoche1.color}" )
    miCoche1.girar()
}

// Creamos clase
class Coche(var color:String){
    // Creamos propiedades del objeto
   // var color:String = "azul"
    var peso: Int = 1500
    val largo: Int = 2
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