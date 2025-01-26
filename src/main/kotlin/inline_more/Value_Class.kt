package inline_more

// Making the constructor private restricts the instantiation of the class from outside the class itself.
// We can only create instances of `TimePeriod` using the provided factory methods in the companion object.
@JvmInline
value class TimePeriod private constructor (val timePeriod: Long){

    companion object{
        fun millis(millis: Long) = TimePeriod(millis)
        fun seconds(seconds: Long) = TimePeriod(seconds*1000)
    }
}

fun displayTimePeriod(message: String,duration: TimePeriod){
    println("Will show $message for ${duration.timePeriod} milliseconds")
    println("Hashcode of the time period ${duration.hashCode()}")
}

fun main(args: Array<String>) {
    displayTimePeriod("Display time period", TimePeriod.millis(2000))
    displayTimePeriod("Display time period", TimePeriod.seconds(2))

}

/**
 * Value classes should not be used with generics due to limitations in type erasure and Java interoperability.
 * Generics in Kotlin are erased at runtime, which can lead to issues when trying to use value classes with generic types.
 * This results in boxing these classes, reintroducing some overhead.
 */

/**
By using value classes,
Kotlin provides a way to efficiently manage simple
data types without the overhead of traditional object-oriented classes.
They ensure type safety and runtime efficiency by treating the class instances as their underlying values,
usually stored on the stack instead of the heap.
This minimizes object creation, simplifies garbage collection, and accelerates access times.*/
