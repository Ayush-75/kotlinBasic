package anonymous

fun counterLambda(): () -> Int {
    var i = 0
    return { i++ }  // Returns a lambda function that increments and returns 'i'
}

fun main() {
    val next = counterLambda()  // 'next' is now a function that we got from 'counter()'

//    Every lambda in Kotlin has an invoke method. This method provides a way to call the lambda directly.
    println(next.invoke())     // Explicitly calls the lambda's 'invoke' method
    println(next)    // Prints the function object reference, not its execution
    println(next)    // Prints the function object reference, not its execution

    // Shorthand for 'next.invoke()'
    println(next())  // Executes the function, prints 0
    println(next())  // Executes the function, prints 1
    println(next())  // Executes the function, prints 2
}
/**
 * next refers to the function object itself.
 * next() calls the function and executes its code, returning its result.*/

fun counterAnonymous():()-> Int{
    var i = 0
    return fun (): Int{
        return i++
    }
}