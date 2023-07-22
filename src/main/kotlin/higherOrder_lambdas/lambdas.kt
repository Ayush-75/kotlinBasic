package higherOrder_lambdas


val lambda = {
    println("This is higher order function")
}

fun higherFunc(mySec: () -> Unit) {
    mySec()
}

fun takeIt(a: Int, b: Int): Int {
    return a + b
}

fun calculator(a: Int, b: Int, myTake: (Int, Int) -> Int) {
    val result = myTake(a, b)
    println(result)
}

fun moreTake():((Int,Int)->Int){
    return ::takeIt
}

fun main(args: Array<String>) {
    //invoke higher-order function
    higherFunc(lambda)                 // passing lambda as parameter
    val fan = ::higherFunc
    fan { println("Hello") }

    calculator(5, 7, ::takeIt)
    calculator(5, 7) { a, b -> a * b }



    val take = moreTake()
    val result = take(5,7)
    println(result)

}