package generics.more_genrics

import java.util.ArrayList

fun main(args: Array<String>) {

    var name = mutableListOf(7,8,9,7,5)
    handleStrings(name)
}

fun handleStrings(list: MutableList<Int>){
    if (list is ArrayList){
        list.forEach(::println)
    }
    println("-----------------------------")
    var name = list as ArrayList
    name.forEach(::println)
}

