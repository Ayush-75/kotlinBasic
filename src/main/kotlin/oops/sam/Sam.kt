package oops.sam

fun main() {
    val foke = object : Runnable {
        override fun invoke() {
            println("its invoke")
        }
    }.invoke()

    val nmak = Runnable { println("its invoke") }.invoke()

    // Creating an instance of a class
    val isEven1 = object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }


    println("Is 7 even? - ${isEven2.accept(7)}")
}

// By leveraging Kotlin's SAM conversion, you can write the following equivalent code instead
// Creating an instance using lambda
val isEven2 = IntPredicate { it % 2 == 0 }

fun interface Runnable {
    fun invoke()
}

fun interface IntPredicate {
    fun accept(i: Int): Boolean

     fun random(){
        println("non abstract function in functional interface")
    }fun random2(){
        println("")
    }
}