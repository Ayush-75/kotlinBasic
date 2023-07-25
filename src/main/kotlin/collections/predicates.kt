package collections

fun main(args: Array<String>) {

    val myNumber = listOf<Int>(2, 3, 4, 5, 6, 7, 8)

    val myPredicate: (Int) -> Boolean = { num: Int -> num < 10 } // Are all elements less than 10?

    val allCheck: Boolean = myNumber.all(myPredicate)//Are all elements satisfying the condition?
    println(allCheck)

    val anyCheck: Boolean = myNumber.any(myPredicate)// Does any of these elements satisfy the predicate?
    println(anyCheck)

    val countCheck: Int = myNumber.count(myPredicate)// Number of elements that satisfy the predicate.
    println(countCheck)

    val findCheck: Int? = myNumber.find(myPredicate)// Returns the first number that matches the predicate
    println(findCheck)
}