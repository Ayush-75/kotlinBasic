package oops.inheritance

fun main(args: Array<String>) {

    var dog = Dog2("Black", "Pug")
//    dog.color="Black"

}

open class Animal3(var color: String) {

    init {
        println("From Animal Init:$color")
    }

}

class Dog2(color: String, var breed: String) : Animal3(color) {

    init {
        println("From Dog Init:$color and $breed")
    }

}