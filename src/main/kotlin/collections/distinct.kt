package collections


/**
 * In Kotlin, the distinct function is used to obtain a
 * list containing only distinct elements from the original collection.
 * It removes any duplicate elements, so each element appears only once in the resulting list.
 * This function is available for various types of collections like lists, sets, and other iterable types.
 */
fun main() {
    val myList = listOf(1, 2, 2, 3, 4, 4, 5, 5, 5)

    // Use distinct to get a list with unique elements
    val distinctList = myList.distinct()

    println("Original List: $myList")
    println("Distinct List: $distinctList")
}

/**
 * The distinct function is particularly useful
 * when you want to remove duplicates from a collection without explicitly
 * implementing your own logic for doing so.
 * It works well for both small and large collections and maintains the original order of elements in the resulting list.
 */