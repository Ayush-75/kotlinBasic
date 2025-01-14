package upcasting_downcasting

// Downcasting: Converting a superclass reference back to a subclass reference.
// This is useful when you need to access subclass-specific methods or properties.
fun main() {
    val animal: Animal = Dog() // Upcasting
    if (animal is Dog) {
        // Downcasting: Converting the Animal reference back to Dog
        val dog = animal as Dog
        println(dog.bark())
    }
}

open class Animal {
    open fun sound() = "Some sound"
}

class Dog : Animal() {
    override fun sound() = "Bark"
    fun bark() = "Woof! Woof!"
}

/**
 * Downcasting: Converting a superclass reference back to a subclass reference.
 * Use Case: Access subclass-specific methods or properties that are not available in the superclass.
 * Do's: Ensure the object is actually an instance of the subclass before downcasting.
 * Don'ts: Avoid downcasting if you are not sure of the object's type, as it can lead to ClassCastException.
 */