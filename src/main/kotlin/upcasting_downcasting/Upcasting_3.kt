package upcasting_downcasting
sealed interface LoginError {
    data class InvalidUsername(val username: String) : LoginError
    object InvalidPasswordFormat : LoginError
}

sealed class CommonError : LoginError {
    // CommonError-specific method
    fun logError() {
        println("Logging error in CommonError")
    }
}

object ServerError : CommonError() {
    // ServerError-specific method
    fun restartServer() {
        println("Restarting the server...")
    }
}

fun handleLoginError(error: LoginError) {
    when (error) {
        is LoginError.InvalidUsername -> println("Invalid username: ${error.username}")
        LoginError.InvalidPasswordFormat -> println("Invalid password format")
        else -> println("Unknown error")
    }

    // LoginError cannot access `logError` here
    // because `logError` is specific to CommonError, not LoginError.
}

fun main() {
    val error = ServerError
    handleLoginError(error)  // This works with LoginError, but can't access logError() method here

    // If you want to access logError() or ServerError-specific methods,
    // you would need to do something like this:
    if (error is CommonError) {
        error.logError()  // This works, because `error` is of type CommonError
    }

    if (error is ServerError) {
        error.restartServer()  // This works, because `error` is of type ServerError
    }
}
