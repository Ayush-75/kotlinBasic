package generics.generics_4

import generics.generics_2.Coin

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
class TrailMix : Snack()
class GummyBears : Snack()
class Toy : Product() // Toy is not a Snack

class VendingMachine<T : Snack>(private val snack: T) {
    fun purchase(money: Coin): T = snack
    fun refund(snack: T): Coin = Dime()
    fun tune() = println("All tuned up!")
}

fun service(machine: VendingMachine<*>) {
    print("Tuning up $machine... ")
    machine.tune()
}
//class VendingMachine<*> {
//    fun purchase(money:Money): Product { upper bound }
//    fun refund(item: Nothing): Money{ /* Cannot actually accept any item */ }
//}

/*
interface Function<in T, out U>
Function<*, String> means Function<in Nothing, String>.

Function<Int, *> means Function<Int, out Any?>.

Function<*, *> means Function<in Nothing, out Any?>.*/

fun main(args: Array<String>) {
    service(VendingMachine(CandyBar())) // Works with VendingMachine<CandyBar>
    service(VendingMachine(TrailMix())) // Works with VendingMachine<TrailMix>
    service(VendingMachine(GummyBears())) // Works with VendingMachine<GummyBears>
}

//interface ArcadeGame<T1>{
//    fun load():T1 & Any
//}