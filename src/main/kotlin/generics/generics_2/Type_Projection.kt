package generics.generics_2


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
open class VendingMachine<T : Product>(private val product: T) {
    // Function to purchase a snack in exchange for a coin
    fun purchase(money: Money): T = product

    // Function to refund - Requires T as the parameter type
    fun refund(product: T): Money = Dime()
    fun randomSnack(): Snack = GummyBear()

    fun performanceMaintenance() = println("All machine is tune up")

//    val purchase: (Coin) -> Snack = { randomSnack() }

}

fun getSnackFrom(machine: VendingMachine<out Snack>): Snack {
    // The refund function cannot be called here because the type parameter T is declared as out (covariant),
    // meaning it can only be returned (produced) and not consumed.
    // machine.refund(Snack())
//    machine.refund(Snack())
    return machine.purchase(Dime())

}

fun main() {

    val candyBarMachine: VendingMachine<CandyBar> = VendingMachine(CandyBar())
    getSnackFrom(candyBarMachine)


    val snackMachine: VendingMachine<out Snack> = candyBarMachine
    // The refund function cannot be called here because the type parameter T is declared as out (covariant),
// meaning it can only be returned (produced) and not consumed.
//    val result = snackMachine.refund(CandyBar())
//
    val snack2Machine: VendingMachine<Snack> = VendingMachine(CandyBar())
    val candyBar2Machine: VendingMachine<in CandyBar> = snack2Machine
    // But the return from purchase() is no longer guaranteed to be exactly a CandyBar;
// it's only known to be some supertype (e.g., a Product).
//    in (Contravariance): It's like a processing center that only accepts certain materials (e.g., "CandyBar" or higher).
//    You can put things in, but you cannot rely on the returned type because the center takes any supertype of your required type.
    val result: Any? = candyBar2Machine.purchase(Dime())
    candyBar2Machine.refund(CandyBar())

    println("runtime ${result!!::class.simpleName}")
    // in the kotlin version 2.0.0+ it will work perfectly fine you don't need to use cast or not null assertion
//    println("runtime ${result::class.simpleName}")

}

/**
 * out-projection -> only return type is allowed, like a producer
 *  refund type, like a consumer, becomes a Nothing type parameter
 *  so it loses some of its depth

 * in-projection -> here producer becomes of Any? return type and
 * consumer allows any superclass of the specified type
* */

class Tender<out T : Snack>(val product: T) {
    fun purchase(money: Coin): T = TODO()
    // The refund function is not allowed because T is declared as out (covariant),
    // meaning it can only be returned (produced) and not consumed.
    // Uncommenting the following line would cause a compilation error.
//    fun refund(snack:T): Coin = TODO()
}


