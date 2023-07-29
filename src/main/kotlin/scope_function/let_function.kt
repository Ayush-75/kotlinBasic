package scope_function

import java.util.*

//Let
fun main(args: Array<String>) {

    /** Scope Function: 'let'
    Property 1: Refer to context object by using 'it'
    Property 2: The return value is the 'lambda result'
    Use 'let' function to avoid NullPointerException
     */

    var name: String? = "ayush" // or null

    val stringLength = name?.let {
        println(it.reversed())
        println(it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
        //or
//        println(it.replaceFirstChar(Char::titlecase))
        println(it.capitalized())
        it.length
    }

    println(stringLength)

}

// you can create custom extension function for your need
fun String.capitalized(): String {
//    return this.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    return this.replaceFirstChar(Char::titlecase)
}