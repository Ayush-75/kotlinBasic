package upcasting_downcasting

fun main() {
    // Upcasting: Assigning a subclass instance (ServerError) to a superclass reference (LoginErrors)
    val errors: LoginErrors = ServerError1
    println(handleLoginError(errors))
}

// CommonErrors is a sealed class that implements LoginErrors
sealed class CommonErrors : LoginErrors

// Singleton objects representing different error types
object ServerError1 : CommonErrors()
object Forbidden : CommonErrors()
object Unauthorized : CommonErrors()

// Sealed interface for login errors
sealed interface LoginErrors {
    // Data class for invalid username error
    data class InvalidUsername(val username: String) : LoginErrors
    // Object for invalid password format error
    object InvalidPasswordFormat : LoginErrors
}

// Function to handle login errors
fun handleLoginError(error: LoginErrors): String {
    // Accessing CommonErrors subclasses directly as instances of LoginErrors
    return when (error) {
        ServerError1 -> "Handling Server Error"
        Forbidden -> "Handling Forbidden Error"
        Unauthorized -> "Handling Unauthorized Error"
        is LoginErrors.InvalidUsername -> "Invalid Username"
        is LoginErrors.InvalidPasswordFormat -> "Invalid Password Format"
    }
}

// Function to handle common errors
fun handleCommonError(error: CommonErrors): String = when (error) {
    Forbidden -> TODO()
    ServerError1 -> TODO()
    Unauthorized -> TODO()
}

/**
 Explanation

- Upcasting: Assigning a subclass instance to a superclass reference.
 This is useful for treating different subclasses uniformly through a common interface or superclass.
- Use Case: Simplifies code by allowing polymorphic behavior.
 For example, handling different error types through a common interface.
- Do's: Use upcasting to leverage polymorphism and write more generic and reusable code.
- Don'ts: Avoid upcasting if you need to access subclass-specific methods
 or properties not defined in the superclass/interface.
 */
