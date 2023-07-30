package scope_function

import java.util.*

//Let
fun main(args: Array<String>) {

    /** Scope Function: 'let'
    Property 1: Refer to context object by using 'it'
    Property 2: The return value is the 'lambda result'
    Use 'let' function to avoid NullPointerException
     */

    /** If you specify a return type explicitly with return@let,
    so you don't need to write at return at last,
    it only works on scope function whose return type is a lambda result,
    it doesn't work on apply and also scope function*/

    var name: String? = "ayush" // or null

    /**
     * Context renaming -> this improves readability, especially if
     * you are nesting the scope function
     * it only works context object "it" like let and also
     */
    val stringLength = name?.let {checkLength->
        println(checkLength.reversed())
        println(checkLength.replaceFirstChar {take-> if (take.isLowerCase()) take.titlecase(Locale.getDefault()) else take.toString() })
        //or
//        println(it.replaceFirstChar(Char::titlecase))
        println(checkLength.capitalized())
        checkLength.length
    }

    println(stringLength)

}

// you can create custom extension function for your need
fun String.capitalized(): String {
//    return this.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    return this.replaceFirstChar(Char::titlecase)
}