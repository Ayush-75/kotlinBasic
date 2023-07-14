package oops.singleton

fun main(args: Array<String>) {

    MyClass.count = 15
    MyClass.typesOfCustomer()
}

/* companion object
With the help of companion object you can create object inside class
 */
class MyClass {
    companion object {
        var count: Int = 1

        fun typesOfCustomer(): String {
            return "Indian"
        }
    }
}