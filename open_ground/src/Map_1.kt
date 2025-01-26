// Class representing a time period with a private constructor to restrict instantiation
@JvmInline
value class TimePeriod private constructor(val timePeriod: Long) {

    companion object {
        // Cache to store TimePeriod instances
        val cache = mutableMapOf<Long, TimePeriod>()

        // Factory method to create or retrieve a TimePeriod instance in milliseconds
        fun millis(millis: Long): TimePeriod {
            return cache.getOrPut(millis) { TimePeriod(millis) }
        }

        // Factory method to create or retrieve a TimePeriod instance in seconds
        fun seconds(seconds: Long): TimePeriod {
            val millis = seconds * 1000
            return cache.getOrPut(millis) { TimePeriod(millis) }
        }
    }
}

// Function to display the time period with a message
fun displayTimePeriod(message: String, duration: TimePeriod) {
    println("Will show $message for ${duration.timePeriod} milliseconds")
    println("Hashcode of the time period ${duration.hashCode()}")
}

fun main(args: Array<String>) {
    // Display time periods using factory methods
    displayTimePeriod("Display time period", TimePeriod.millis(2000))
    displayTimePeriod("Display time period", TimePeriod.seconds(3))

    // Print the cache contents
    for ((key, value) in TimePeriod.cache) {
        println("key for $value : $key")
    }
}