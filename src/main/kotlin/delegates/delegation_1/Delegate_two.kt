package delegates.delegation_1

/**
* Lack of Flexibility: The Printer class is tightly coupled to the Hp and Epson classes,
*  making it difficult to extend or modify the behavior without changing the Printer class itself.
Code Duplication: If you need to add more printer types, you will have to duplicate the code for each new type,
*  leading to code duplication and increased maintenance effort.
Reduced Reusability: The Printer class cannot be easily reused with other implementations of the
Task interface without modifying the class.
Harder to Test: Tightly coupled code is harder to test in isolation because the
Printer class directly depends on the Hp and Epson classes.
Violation of SOLID Principles: This approach violates the Dependency Inversion Principle (DIP)
and the Open/Closed Principle (OCP) of SOLID principles,
*  making the code less maintainable and scalable.*/

fun main() {
    val printer3 = Printer3()
    printer3.printHp()
    printer3.printEpson()
}

// Interface defining the task
interface Task2 {
    fun print2()
}

// Implementation of Task2 by Hp
class Canon : Task2 {
    override fun print2() {
        println("Canon is printing")
    }
}

// Implementation of Task2 by Brother
class Brother : Task2 {
    override fun print2() {
        println("Brother is printing")
    }
}

// Printer3
//class with tight coupling to Canon and Brother
class Printer3 {
    private val canon = Canon()
    private val brother = Brother()

    fun printHp() {
        canon.print2()
    }

    fun printEpson() {
        brother.print2()
    }
}