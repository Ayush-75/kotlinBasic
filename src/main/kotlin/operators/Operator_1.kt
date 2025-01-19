package operators

data class Vector(val x: Int, val y: Int) {
    // Using the operator keyword to overload the plus (+) operator
    operator fun plus(other: Vector): Vector {
        return Vector(this.x + other.x, this.y + other.y)
    }
}

fun main() {
    val v1 = Vector(1, 2)
    val v2 = Vector(3, 4)
    val sum = v1 + v2 // This uses the overloaded + operator
    println(sum) // Output: Vector(x=4, y=6)

    val counter = Counter(5)
    counter+=5
    println(counter.value)
}
/*
* Avoid Modifying Internal State Directly:

Direct modifications can lead to unexpected side effects that are difficult to trace.
Avoid Overloading Arbitrary or Confusing Operators:

Don't overload operators if doing so doesn’t make logical sense for your class.*/

class Counter(var value: Int){
    operator fun plusAssign(increment: Int){
        value+=increment
    }
}