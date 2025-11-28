* Las variables en kotlin se dividen en dos:
    * var -> variable su contenido puede variar, lo podemos modificar
    * val -> valor, su contenido no se puede variar una vez instanciado, algo como una constante.

*Variables tipo numéricas*

    Variables tipo int  
        Se instacian: val nombreVariable:tipo = valor
                        val myIntVariableInt:Int = 12
                         var myIntVariableInt:Int = 12

        Variables tipo FLoat   
        Se instacian: val nombreVariable:tipo = valor
                        val myIntVariableFloat:Float = 12.5f
                         var myIntVariableFloat:Float = 12.5f


        Variables tipo Long  
        Se instacian: val nombreVariable:tipo = valor
                        val myIntVariableLong:Long = 120000000
                         var myIntVariableLong:Long = 120000000


        Variables tipo Double  
        Se instacian: val nombreVariable:tipo = valor
                        val myIntVariableDouble:Double = 12.124578
                         var myIntVariableDouble:Double = 12.124578


        Variables tipo String  
        Se instacian: val nombreVariable:tipo = valor
                        val myIntVariableString:String = "Me llamo jose"
                         var myIntVariableString:String = "12"

        Variables tipo Booleanas  
        Se instacian: val nombreVariable:tipo = valor
                        val myIntVariableBool:Boolean = true
                         var myIntVariableBool:Boolean = false


// String concatenadas  
val age:Int = 30
val stringExample: String = "JdevCedres"
var stringConcatenada: String = "Hola"  
println(stringConcatenada)  
stringConcatenada = "Hola me llamo $stringExample y tengo $age años"
println(stringConcatenada)
Hola me llamo JdevCedres y tengo 30 años