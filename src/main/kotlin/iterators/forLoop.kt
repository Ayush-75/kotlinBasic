package iterators

import java.lang.NumberFormatException
import java.text.NumberFormat

fun main(args: Array<String>) {

    //loops

    //For loops

    for (i in 1..10){
        if (i%2==0){
            continue
        }
            println(i)
    }

    println("----------------------------------------")

    for (i in 1..10){
        if (i%2==0) {
            println(i)
        }
    }




}