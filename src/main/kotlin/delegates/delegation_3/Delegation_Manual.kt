package delegates.delegation_3

// Define an interface with common account operations
interface Account2 {
    fun deposit(amount: Double)
    fun withdraw(amount: Double)
}

// Basic account implementation
class BasicAccount2 : Account2 {
    override fun deposit(amount: Double) {
        println("Deposited $$amount to the basic account")
    }

    override fun withdraw(amount: Double) {
        println("Withdrew $$amount from the basic account")
    }
}

// SavingsAccount class manually delegating methods
class SavingsAccount2(private val account: Account2) : Account2 {
    override fun deposit(amount: Double) {
        println("Deposited $$amount to the savings account with interest")
    }

    override fun withdraw(amount: Double) {
        println("Withdrew $$amount from the savings account with penalty")
    }

    fun delegateDeposit(amount: Double) {
        account.deposit(amount)
    }

    fun delegateWithdraw(amount: Double) {
        account.withdraw(amount)
    }
}

fun main() {
    val basicAccount = BasicAccount2()
    val manualSavingsAccount = SavingsAccount2(basicAccount)
    manualSavingsAccount.deposit(100.0) // Output: Deposited $100.0 to the savings account with interest
    manualSavingsAccount.withdraw(50.0) // Output: Withdrew $50.0 from the savings account with penalty

    // Delegating to BasicAccount without using 'by' keyword
    manualSavingsAccount.delegateDeposit(100.0) // Output: Deposited $100.0 to the basic account
    manualSavingsAccount.delegateWithdraw(50.0) // Output: Withdrew $50.0 from the basic account
}

/**
* Manual Delegation (Without by Keyword):
More boilerplate code to manually forward each method.
Less concise but still offers the benefits of loose coupling.

Automatic Delegation (With by Keyword):
Less boilerplate code; more concise and readable.
Leverages Kotlin's powerful language features to simplify design.
 */