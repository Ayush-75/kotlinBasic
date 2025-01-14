package higherOrder_lambdas

fun main(args: Array<String>) {

    var result = 0

    val program = MyPro()

    // Here we are able to modify a local variable `result` which is out of scope of this lambda function.
    // This demonstrates a closure,
    // where the lambda captures and modifies the `result` variable from its surrounding scope.
    program.addTwoNumbers(2, 7) { x, y -> result = x * y }

    println(result)
}

class MyPro {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {  // High-Level Function with Lambda as Parameter

        action(a, b)

    }
}