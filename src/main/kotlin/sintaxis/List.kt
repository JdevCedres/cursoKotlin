package sintaxis

fun main() {
    mutableList()
    // sintaxis.inmutableList()

}
// Inmutable list
fun inmutableList(){
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado","Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last()) //Me da el último valor en este caso domingo
    println(readOnly.first()) // Me da el primer valo en este caso el lunes
    // Filtrar
    val example = readOnly.filter { it.contains("a") } // Me filtra todos los valores que contengan una a
    println(example)
    // recorrer las listas esta vez con foreach
    readOnly.forEach { weekDay -> println(weekDay) }

    // Mutable list

}
fun mutableList(){
    val weekDays: MutableList<String> = mutableListOf()
    println(weekDays)
    // Tiene lo mismo que la inmutable list más que se pueden añadir más valores
    weekDays.add(0,"JoseDay")  // si no le indicas el indice lo pondrá en el último lugar, en este caso ira el primero
    println(weekDays)
    // Podemos ver si está vacía y si no que nos la printee
    if (weekDays.isEmpty()){
        // No pinta nada porque está vacia
    }else {
        weekDays.forEach {days -> println(days) }
    }
    if (weekDays.isNotEmpty()){
        weekDays.forEach {days -> println(days) }
    }
}