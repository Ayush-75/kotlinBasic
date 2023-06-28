package control_statement

fun main() {


    val x = 20
    val b = 10

    when(x){
        !in 1..19-> println("x is 20")
        2-> println("x is 2")
        in 1..20 -> println("in 1 to 20 range")

        // Default case
        else-> println("I don't know x")
    }

    var str:String = when(b){
        0,1 -> "b is 0 or 1"
        in 1..20->"b is range of 1 to 20"
        2 -> "b is 2"
        else->{ "b is value Unknown"}
    }

    println(str)

}