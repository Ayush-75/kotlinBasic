package operators

data class Box(val items: List<String>) {
    // Overload the plus (+) operator to return a new instance
    operator fun plus(item: String): Box {
        // Create a new Box instance with the new item added
        return Box(items + item)
    }
}

fun main() {
    val box1 = Box(listOf("apple"))
    val box2 = box1 + "banana" // This creates a new Box instance

    println(box1.items) // Output: [apple]
    println(box2.items) // Output: [apple, banana]
}