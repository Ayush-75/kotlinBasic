package control_statement

fun main(args: Array<String>) {

    val a = 5
    val b = 6

    val maxValue:Int = if (a>b){
        println("a is greater ")
        a
    }else {
        println("b is greater")
        b
    }

    println(maxValue)

}