package delegates.delegation_3


// Define an interface with common account operations
interface Account1 {
    fun deposit(amount: Double)
    fun withdraw(amount: Double)
}

// Basic account implementation
class BasicAccount1 : Account1 {
    override fun deposit(amount: Double) {
        println("Deposited $$amount to the basic account")
    }

    override fun withdraw(amount: Double) {
        println("Withdrew $$amount from the basic account")
    }
}

// SavingsAccount class using delegation
class SavingsAccount1(private val account: Account1) : Account1 by account {
    override fun deposit(amount: Double) {
        println("Deposited $$amount to the savings account with interest")
    }

    override fun withdraw(amount: Double) {
        println("Withdrew $$amount from the savings account with penalty")
    }
}

fun main() {
    val basicAccount = BasicAccount1()
    val savingsAccount = SavingsAccount1(basicAccount)
    savingsAccount.deposit(100.0) // Output: Deposited $100.0 to the savings account with interest
    savingsAccount.withdraw(50.0) // Output: Withdrew $50.0 from the savings account with penalty
}

/**
* Loose coupling between cooperating objects.
More flexible and changeable design.
Represents a "has-a" relationship.
Easily extendable by swapping or adding delegate objects.*/