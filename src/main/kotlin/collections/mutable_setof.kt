package collections

// "Set" contains unique elements
// "HashSet" also contains unique element but sequence is not guaranteed in output

fun main() {

    // Duplicate values are not allowed
    // mutablSetOf sequence is guaranteed in output
    var mySet1 = mutableSetOf<Int>(5, 8, 7, 9, 10, 11, 11, 12) //Mutable set Read and write both

    mySet1.remove(5)
    mySet1.add(6)
    mySet1.add(75)
    //"HashSet" also contains unique element but sequence is not guaranteed in output

    var mySet2 = hashSetOf<Int>(5, 8, 7, 9, 10, 11, 11, 12) //Mutable set Read and write both

    for (element in mySet1) {
        println(element)
    }
    println()
    for (element in mySet2) {
        println(element)
    }
    println()
    mySet1.forEach(::println)

}
