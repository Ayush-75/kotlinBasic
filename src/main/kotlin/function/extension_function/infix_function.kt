package function.extension_function

fun main(args: Array<String>){

    val x:Int=6
    val y:Int=10

    val greaterValue= x greaterVal y // you can only pass one parameter in infix and no need of brackets and dots
    println(greaterValue)
}

infix fun Int.greaterVal(other:Int):Int{
    return if (this>other)
        this
    else
        other
}