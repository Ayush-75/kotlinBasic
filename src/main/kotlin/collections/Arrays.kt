package collections

import higherOrder_lambdas.MyInterface


/**
 *   Arrays
 *   Mutable array but fixed sized
 *
 *    Elements :   32  0   0   54  0
 *    Index    :   0   1   2   3   4
 */
fun main(args: Array<String>) {

    var myArray = Array<Int>(5){0}
    myArray[0] = 5
    myArray[1] = 24
    myArray[2] = 6
    myArray[3] = 4
    myArray[4] = 2

//    myArray[8] = 5 // it will throw error outOfBound Exception

    // many ways to print all elements present inside the array
    myArray.forEach { println(it) }

    println()

    for (element in myArray){    // Using individual elements (Objects)
        println(element)
    }

    println()

    for (index in myArray.indices){
        println(myArray[index])
    }

    println()

    for (index in 0 .. myArray.size - 1){
        println(myArray[index])
    }
    println()

    for (index in 0 until myArray.size){
        println(myArray[index])
    }

    println("----")

    myArray.forEach(::println)

}