

sealed class NetworkResult<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T?) : NetworkResult<T>(data)
    class Error<T>(message: String?, data: T? = null) : NetworkResult<T>(data, message)
    class Loading<T>() : NetworkResult<T>()
}


class SimulateViewModel {

    private var listener: ((NetworkResult<String>) -> Unit)? = null

    fun setListener(listener: (NetworkResult<String>) -> Unit) {
        this.listener = listener
    }

    fun fetchData(success: Boolean) {
        listener?.invoke(NetworkResult.Loading())

        if (success) {
            listener?.invoke(NetworkResult.Success("Fetch data Successfully"))
        } else {
            listener?.invoke(NetworkResult.Error("Failed to fetch data"))
        }
    }
}

fun simulateObserverPattern(){
    val viewModel = SimulateViewModel()

    viewModel.setListener { response ->
        when(response){
            is NetworkResult.Error -> {
                println("Error: ${response.message}")
            }
            is NetworkResult.Loading -> {
                println("Loading..")
            }
            is NetworkResult.Success -> {
                println("Success: ${response.data}")

            }
        }
    }

    println("Simulating a successful network call:")
    viewModel.fetchData(success = true)

    println("\nSimulating a failed network call:")
    viewModel.fetchData(success = false)
}
fun main() {
    simulateObserverPattern()
}