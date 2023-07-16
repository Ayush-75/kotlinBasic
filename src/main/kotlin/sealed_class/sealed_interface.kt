package sealed_class


/**
sealed interface Error // has implementations only in same package and module

sealed class IOError(): Error // extended only in same package and module
open class CustomError(): Error // can be extended wherever it's visible
* */
sealed interface Shape1 {
    fun calculateArea(): Double
}

class RectangleArea(private val width: Double, private val height: Double) : Shape1 {
    override fun calculateArea(): Double {
        return width * height
    }
}

class CircleArea(private val radius: Double) : Shape1 {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

fun main() {
    val rectangleArea: Shape1 = RectangleArea(5.0, 3.0)
    val circleArea: Shape1 = CircleArea(2.5)

    println("Rectangle area: ${rectangleArea.calculateArea()}")
    println("Circle area: ${circleArea.calculateArea()}")
}