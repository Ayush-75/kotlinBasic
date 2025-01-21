package generics.generics_3

// A simple class hierarchy:
open class Product
open class Snack : Product()
class CandyBar : Snack()

// 1) Class with no declared variance:
open class VendingMachine<T : Product>(private val item: T) {
    // Method that 'returns' T
    fun purchase(): T = item

    // Method that 'consumes' T
    fun refund(product: T) {
        println("Refunded a product: ${product::class.simpleName}")
    }
}

fun main() {
    // Usage-Site Variance with 'in CandyBar'
    val machine: VendingMachine<in CandyBar> = VendingMachine(CandyBar())

    // "in CandyBar" – safe to pass CandyBar in 'refund':
    machine.refund(CandyBar())

    // But the 'purchase()' return type is not guaranteed to be CandyBar:
    // From the compiler’s perspective, it's only known to be a 'Product' or 'Any?'.
    // An explicit cast might be needed if you're sure at runtime it's CandyBar.
    val item: Any? = machine.purchase()  // Compiles, but recognized as Product
    println("Runtime type: ${item!!::class.simpleName}")

    // 2) Declaration-Site Variance Example:
    val declaredMachine = InVendingMachine(CandyBar())
    // declaredMachine.purchase() => type error or Any?
    // because T is declared 'in' at the class level,
    // the compiler disallows strongly typed returns.
}

// Declaration-site contravariant class:
class InVendingMachine<in T : Product>(private val item: T) {
    // If you try to return T here, some Kotlin versions will force you to use Any?:
    // fun purchase(): T = item // Error: cannot return T from a contravariant class
}