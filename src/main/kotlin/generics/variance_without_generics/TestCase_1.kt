package generics.variance_without_generics

/**
 * Defining basic types for the vending machine example
 */

// Coin and Money hierarchy
open class Coin : Money()
class Nickel : Coin()
class Dime : Coin()
class Dollar : Bill()
open class Money
open class Bill : Money()

// Snack and Product hierarchy
open class Product
open class Snack : Product()
class CandyBar : Snack()
class GummyBear : Snack()
class Toy : Product() // Toy is not a Snack

/**
 * VendingMachine class to demonstrate variance
 */
open class VendingMachine {
    // Function to purchase a snack in exchange for a coin
    open fun purchase(money: Coin): Snack = Snack()

    // Function to refund - Requires T as the parameter type
    open fun refund(product: Product): Money = Dime()
    open fun randomSnack(): Snack = GummyBear()

    open val purchase: (Coin) -> Snack = { randomSnack() }
}

/**
 * Special Vending Machines
 */
class CandyBarMachine : VendingMachine() {
    // Overrides purchase to always return a CandyBar
    override fun purchase(money: Coin): CandyBar = CandyBar()
}

class AnyMoneyVendingMachine : VendingMachine() {
    // Using a property with a function type workaround for more general types
    /**
    By the way: variance does still apply to properties as well.

    A property that’s declared with val can be overridden and given a more specific type,
    just as you can do with a function return type.
    A property that’s declared with var can also be overridden, of course,
    but its type must be exactly the same as what’s declared in its supertype -
    you can’t replace it with a more specific or more general type.
     * */
    override val purchase: (Money) -> Snack = { randomSnack() }

    override fun randomSnack(): Snack = when((1..3).random()){
        1 -> GummyBear()
        2 -> CandyBar()
        else -> Snack()
    }
}

fun purchaseSnackFrom(machine: VendingMachine) = machine.purchase(Dime())

/**
 * Main function: Test the code
 */
fun main() {

    val machine: VendingMachine = CandyBarMachine()

    val snack: Snack = purchaseSnackFrom(CandyBarMachine())
    println("Purchased snack: ${snack::class.simpleName}")

    val vendingMachine: VendingMachine = AnyMoneyVendingMachine()
    val anyMoneyVendingMachine: AnyMoneyVendingMachine = AnyMoneyVendingMachine()

    val snack1: Snack = vendingMachine.purchase(Dime())
    println("Purchased snack1: ${snack1::class.simpleName}")
    val snack2: Snack = anyMoneyVendingMachine.purchase(Dime())
    println("Purchased snack2: ${snack2::class.simpleName}")
    val snack3: Snack = anyMoneyVendingMachine.purchase(Dollar())
    println("Purchased snack3: ${snack3::class.simpleName}")


}
