package basic

fun main(args: Array<String>) {
    var myName: String = "Ayush" // var is mutable
    val myAge: Int = 22 // val is immutable
    println(myName)

}

class Person1(var name: String) {

    fun  display(){
        println("The name of the person is $name")
    }
}