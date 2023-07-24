package collections

fun main(args: Array<String>) {

    //"Set" contains unique elements
    // "HashSet" also contains unique element but sequence is not guaranteed in output
    // duplicate value is not allowed

    var mySet = setOf<Int>(2,54,1,0,7,8,75,24,9,9,8) // Immutable Read only
    // Duplicate values are not allowed

    mySet.forEach(::println)
}