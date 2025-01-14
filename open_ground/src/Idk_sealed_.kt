fun main() {

    val errors: List<CommonErrors> = listOf(
        ServerError(),
        InvalidUsername("user123"),
        UserNotFound("user123"),
        Forbidden(),
        InvalidPasswordFormat(),
        InvalidUserId("user123"),
        Unauthorized()
    )

    errors.forEach { error ->
        handleError(error)
    }
}
// Base class for common errors
open class CommonErrors {
    open fun message(): String = "Common error"
}

// Specific class for login errors extending the base class
class InvalidUsername(val username: String) : CommonErrors() {
    override fun message(): String = "Invalid Username: $username"
}

class InvalidPasswordFormat : CommonErrors() {
    override fun message(): String = "Invalid Password Format"
}

// Specific class for user-related errors extending the base class
class UserNotFound(val userId: String) : CommonErrors() {
    override fun message(): String = "User Not Found: $userId"
}

class InvalidUserId(val userId: String) : CommonErrors() {
    override fun message(): String = "Invalid User ID: $userId"
}

// Common error types extending the base class
class ServerError : CommonErrors() {
    override fun message(): String = "Server Error"
}

class Forbidden : CommonErrors() {
    override fun message(): String = "Forbidden"
}

class Unauthorized : CommonErrors() {
    override fun message(): String = "Unauthorized"
}

// Function to print error messages
fun handleError(error: CommonErrors) {
    println(error.message())
}