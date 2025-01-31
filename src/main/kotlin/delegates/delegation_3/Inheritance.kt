package delegates.delegation_3

/**
Base Class and Derived Class
 */

open class Account {
    open fun deposit(amount: Double) {
        println("Deposited $$amount to the account")
    }

    open fun withdraw(amount: Double) {
        println("Withdrew $$amount from the account")
    }
}

class SavingsAccount : Account() {
    override fun deposit(amount: Double) {
        println("Deposited $$amount to the savings account with interest")
    }

    override fun withdraw(amount: Double) {
        println("Withdrew $$amount from the savings account with penalty")
    }
}

fun main() {
    val account = SavingsAccount()
    account.deposit(100.0) // Output: Deposited $100.0 to the savings account with interest
    account.withdraw(50.0) // Output: Withdrew $50.0 from the savings account with penalty
}

/**
* Inheritance:
Tight coupling between parent and child classes.
Changes in the parent class affect the child class.
Represents an "is-a" relationship.
 */