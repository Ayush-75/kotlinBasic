package sealed_class

sealed class Shape(){
    class Circle(var radius:Float):Shape()
    class Square(var side:Int):Shape()

    object NotShape:Shape()
//    sealed class Line:Shape()
//    sealed interface Draw
}
class Rectangle(var length:Int,var breath:Int):Shape()

fun main(args: Array<String>) {

    var circle = Shape.Circle(3.0f)
    var square = Shape.Square(8)
    var rectangle = Rectangle(20,10)
    var noshape = Shape.NotShape

    checkShape(circle)

}

fun checkShape(shape: Shape){
    when(shape){
        is Shape.Circle -> println("Circle area is ${3.14 * shape.radius * shape.radius}")
        is Rectangle -> println("Rectangle area is ${shape.length * shape.breath}")
        is Shape.Square -> println("Square area is ${shape.side * shape.side}")
        Shape.NotShape -> println("Not a Shape")
    }
}