package delegates.delegation_more


interface Base{
    val message: String
    fun print()
}

class BaseImpl(x: Int): Base{
    override val message: String = "BaseImpl : x = $x"
    override fun print() {
        println(message)
    }
}

class Derived(b: Base): Base by b{
    // This property is not accessed from b's implementation of `print`
    override val message: String = "Message of Derived"
}

fun main() {
    val b = BaseImpl(10)
    val derived = Derived(b)
    derived.print()
    print(derived.message)
}

/**
* Overrides work as you expect: the compiler will use your override implementations instead of those in the delegate object.
*  If you want to add override fun printMessage() { print("abc") } to Derived,
*  the program would print abc instead of 10 when printMessage is called:*/

/**
* By using delegation, you can easily reuse functionality from other classes
* while retaining the flexibility to override specific behaviors as needed.
* This approach promotes code reuse and maintainability,
* making your codebase more modular and adaptable.*/