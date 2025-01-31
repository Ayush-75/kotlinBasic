package delegates.delegation_1

fun main() {

    val epson = Epson()
    val hp = Hp()

    val printer = Printer(epson)
    printer.print()

    val printer2 = Printer2(hp)
    printer2.print()


}

// Delegation is a design pattern where an object handles a request by delegating to a second object (the delegate).
// Benefits of delegation include code reuse, separation of concerns, and easier maintenance.
// It solves the problem of code duplication and tight coupling by allowing objects to delegate responsibilities to other objects.

interface Task{
    fun print()
}

class Hp: Task{
    override fun print() {
        println("Hp is printing")
    }
}
class Epson: Task{
    override fun print() {
        println("Epson is printing")
    }
}

// The `by` keyword in Kotlin is used for delegation.
// It allows an object to delegate the implementation of an interface to another object.
class Printer(val printer: Task): Task by printer

// In the Printer2 class, the print function is manually delegated to the printer object.
class Printer2(val printer: Task){
    fun print(){
        printer.print()
    }
}
