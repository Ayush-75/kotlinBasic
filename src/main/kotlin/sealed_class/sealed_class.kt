package sealed_class

fun main(args: Array<String>) {

}

sealed class Shape {
    data class Circle(var radius: Float) : Shape()
    class Square(var side: Int) : Shape()
    class Rectangle(var length: Int, var breath: Int) : Shape()
//    object NotAShape:Shape()
//
//    sealed class Line:Shape()
//    sealed interface Draw
}
