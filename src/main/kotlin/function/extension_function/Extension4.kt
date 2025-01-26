package extension_function


/**
 * If a class has a member function,and an extension function is
defined which has the same receiver type, the same name,
and is applicable to given arguments, the member always wins. For example:

 * However, it's perfectly OK for extension functions
 *  to overload member functions that have the same name but a different signature:
 */

fun main(args: Array<String>) {


    class Example {
        fun printType() = println("Class method")
    }

    fun Example.printType() = println("Outside extension method")

    Example().printType()

fun Example.printFunctionType(i: Int) { println("Extension function #$i") }

    Example().printFunctionType(1)
}

