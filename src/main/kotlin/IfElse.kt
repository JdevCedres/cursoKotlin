
fun main(){
    ifInt()
}

fun ifMultipleOr(){
    var pet = "dog"
    var isHappy = true
    if (pet == "dog" || (pet == "cat" && isHappy)){
        println("Es un gato o un perro")
    }
}

fun ifMultiple(){
    var age = 18
    var parentPermission = false
    var imHappy = true

    if (age >=18 && parentPermission && imHappy){
        println("Puedo emborracharmeeee")
    }else {
        println("No puedes beberrrr niñato")
    }
}

fun ifInt(){
    var age = 29
    if (age >= 18){
        println("Quiero cerveza")
    }else {
        println("Quiero un jugo de naranja...")
    }
}

fun ifBoolean(){
    var soyFeliz = false
    if (!soyFeliz){
        println("Estoy triste :( ")
    }
}

fun ifAnidados(){
    val animal = "pulpo"
    if (animal == "dog"){
        println("Es un perrito!!!")
    }else if (animal == "cat") {
        println("es un gato!!")
    }else if (animal == "bird"){
        println("es un Pajaro!!")
    }else {
        println("No es un animal guay!!!")
    }
}

fun ifBasic(){
    val name = "Pepe"
    if (name == "Jose"){
        println("Oye , la variable name es JOSE")
    }else{
        println("Este no es Jose")
    }
}