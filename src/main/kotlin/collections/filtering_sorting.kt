package collections

/**
 * Important Function
 * Filters: Returns a list containing only an element matching the given[Predicate]
 * Filters : Filter our desired element from a collection
 *
 * Map: perform operation, Modify elements
 * Map: Returns a list containing the result applying the given[transform] function
to each element in the original collection
 */
fun main(args: Array<String>) {

    val mapOf: List<Int> = listOf<Int>(4, 5, 6, 8, 7)

    /**
    Filters
    Filter our desired element from collection
     */
    val filterOf = mapOf.filter { it <= 5 } // or v -> v<10

    /**
    Map
    perform operation, Modify elements
     */
    val squareOf = mapOf.map { it * it } // or num -> num*num

    //Map and Filter Both
    val myNumber = listOf<Int>(5, 11, 12, 10, 25, 6, 8).filter { it < 10 }.map { it * it }

    myNumber.forEach(::println)

    val people = listOf<Person>(Person("Ayush", 24), Person("axtentorh", 24), Person("Golu", 24))

    /**
     * Case-insensitive:
     * By setting ignoreCase = true, the comparison becomes case-insensitive.
     * This means that differences in letter case are ignored,
     * and uppercase and lowercase letters are treated as equivalent.
     *
     *
     * Case-sensitive:
     * Without specifying the ignoreCase parameter or setting it to false, the comparison is case-sensitive.
     * This means that differences in letter case are significant,
     * and uppercase and lowercase letters are treated as distinct.
     */

    var names = people.filter { it.name.startsWith("A", true) }
        .filter { it.name.endsWith("H", true) }
        .map { it.name }

    names.forEach(::println)

}

class Person(var name: String, var age: Int)