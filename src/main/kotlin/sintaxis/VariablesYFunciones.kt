package sintaxis

/**
 * Variables "val -> valor no puedes reasignar valor  var -> variable esta si que se puede"
 */
val age: Int = 30

fun main() {

    showMyName()
    showMyAge(25)
    add(25,26)
    val mySubtrack = subtrack(10, 5)
    println(mySubtrack)
}

fun showMyName() {
    println("Me llamo JdevCedres")
}

fun showMyAge(currentAge: Int = 48) {
    println("Tengo $currentAge años")
} // parametros por defecto.

fun variablesNumericas() {

    /**
     * Valores numéricas
     */

    // INT

    val age2: Int = 29

    // Long
    val exampleLong: Long = 1200

    // Float
    val exampleFloat: Float = 12.3f

    //Double
    val exampleDouble: Double = 12.3333333

    println("Sumar")
    println(age + age2)

    println("Restar")
    println(age - age2)

    println("Multiplicar")
    println(age * age2)

    println("Dividir")
    println(age / 2)

    println("Modulo")
    println(age % age2)

    val sumaExampleFloatInt: Float = exampleFloat + age  // se puede pero lo convertiria en float
    val sumaExampleFloatInt2: Int = exampleFloat.toInt() + age // con to int en este caso obligamos que sea int
    println(sumaExampleFloatInt)

}

fun varibalesBoolean() {
    /**
     * Variables booleanas
     */
    var booleanExample3 = false
    println(booleanExample3)
    booleanExample3 = true
    println(booleanExample3)

    /**
     * Valores booleanas
     */

    // Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
}

fun alfaNumericas() {
    /**
     * Valores alfaNuméricas
     */

    // Char
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    // String
    val name = "Jose"
    val stringExample: String = "JdevCedres"
    val stringExample2: String = "JdevCedres Manuel y Elena"
    val stringExample3: String = "4"
    val stringExample4: String = "23"

    // String concatenadas


    var stringConcatenada: String = "Hola"
    println(stringConcatenada)
    stringConcatenada = "Hola me llamo $stringExample y tengo $age años"
    println(stringConcatenada)
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtrack(firstNumber:Int, secondNumber:Int):Int {
    return  firstNumber - secondNumber
}

fun subtrackModern(firstNumber:Int, secondNumber:Int) = firstNumber - secondNumber // la misma función refactorizada...

