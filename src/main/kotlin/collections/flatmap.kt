package collections

/**
 * In Kotlin, the flatMap function is used to transform elements in a collection (like lists or sets)
 * and then flatten the results into a single list. It is a combination of the map and flatten functions.
 * The map function applies a transformation to each element,
 * and the flatten function then merges the resulting lists into one.
 *
 * The flatMap function is often used when you have nested collections,
 * and you want to apply some operation to each element of
 * the nested collections and obtain a single flattened list as a result.
 */
fun main() {
    val listOfLists = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    // Use flatMap to transform and flatten the lists
    val flattenedList = listOfLists.flatMap { it.map { num -> num * 2 } }

    println("Flattened List: $flattenedList")
}

/**
 * Remember that flatMap is a useful tool when dealing with
 * nested collections and wanting to perform transformations
 * while keeping the final result as a single, flat collection.
 */