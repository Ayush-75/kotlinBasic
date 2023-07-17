package sealed_class

fun main() {

}
sealed class CommonErrors : LoginErrors, GetUserErrors // extend both hierarchies 👍
object ServerError : CommonErrors()
object Forbidden : CommonErrors()
object Unauthorized : CommonErrors()

sealed interface LoginErrors {
    data class InvalidUsername(val username: String) : LoginErrors
    object InvalidPasswordFormat : LoginErrors
}

sealed interface GetUserErrors {
    data class UserNotFound(val userId: String) : GetUserErrors
    data class InvalidUserId(val userId: String) : GetUserErrors
}

fun handleLoginError(error: LoginErrors): String = when (error) {
    Forbidden -> TODO()
    ServerError -> TODO()
    Unauthorized -> TODO()
    LoginErrors.InvalidPasswordFormat -> TODO()
    is LoginErrors.InvalidUsername -> TODO()
}

fun handleGetUserError(error: GetUserErrors): String = when (error) {
    Forbidden -> TODO()
    ServerError -> TODO()
    Unauthorized -> TODO()
    is GetUserErrors.InvalidUserId -> TODO()
    is GetUserErrors.UserNotFound -> TODO()
}

fun handleCommonError(error: CommonErrors): String = when (error) {
    Forbidden -> TODO()
    ServerError -> TODO()
    Unauthorized -> TODO()
}