package basic

fun main(args: Array<String>) {

    val name: String = "Ayush"
    // String Interpolation with $ sign
    val surname = "$name Shrivastava"
    println(surname)

    // no need to add new keyword for creating an object in kotlin
    var rect = Rectangle()

    rect.length = 10
    rect.breath = 20

    println("The area of rectangle is ${rect.length * rect.breath}")

}

class Rectangle {
    var length: Int = 0
    var breath: Int = 0
}
