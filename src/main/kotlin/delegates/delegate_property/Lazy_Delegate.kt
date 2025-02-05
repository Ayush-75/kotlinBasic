package delegates.delegate_property

class LazyDelegate {
    // The lazyValue property is initialized only when it is accessed for the first time
    val lazyValue: String by lazy {
        println("Computed!")
        "Hello, Lazy Property!"
    }
}

fun main() {
    val lazyDelegate = LazyDelegate()
    println(lazyDelegate.lazyValue)  // "Computed!" is printed, followed by "Hello, Lazy Property!"
    println(lazyDelegate.lazyValue)  // Only "Hello, Lazy Property!" is printed
}
