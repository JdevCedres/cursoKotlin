fun main() {
    var name:String? = "Jose"

    println(name?.get(3) ?: "Es nulo mostro") //con El ? decimos si name no es nulo haz algo, !! estamos segurisimo de que no es nulo ?:  si no es nulo pinta la posición 3 y si lo es printa que puse
}