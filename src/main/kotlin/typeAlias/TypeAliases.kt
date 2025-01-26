package typeAlias

import java.util.Scanner as Input

fun main(args: Array<String>) {

    val f:Predicate<Int> = {it>0}
    println(f(5))
    println(foo(f))

    val p:Predicate<Int> = {it>0}
    println(listOf(5,7,-1,1).filter(p))

    val filter:FilterList<Int> = {it.isNotEmpty()}
    println(filter(mutableListOf(4,7,8,9)))


    val pi = Input(System.`in`) // big import name or class name can be shorted as per your need

}

fun something(people:Temu){
    people("A")
}
/*
* A type alias is like giving a nickname to an existing type.
*  For example, instead of writing (Int) -> Boolean everywhere in your code,
*  you can create a type alias like this:

* Now, you can use Predicate<Int> instead of writing (Int) -> Boolean.
*  It's just a shortcut to make your code cleaner and easier to read.

So if you have some code that uses Predicate<Int>,
*  the Kotlin compiler will understand it as (Int) -> Boolean.
*  You can interchange them freely because they mean exactly the same thing to the compiler.
 */

//You can provide different aliases for function types:
typealias Predicate<T> = (T) -> Boolean
fun foo(p:Predicate<Int>):Boolean = p(42)

typealias Temu = (s:String) -> Unit
typealias FilterList<T> = (MutableList<T>) -> Boolean