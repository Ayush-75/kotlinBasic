package generics.more_genrics

fun main(args: Array<String>) {

    val list = arrayListOf("All day",7,7.5,"Ayush",'T',"Pushing p").filterIsInstance<String>()
    list.forEach(::println)

    val somePair: Pair<Any?, Any?> = "items" to listOf(1,2,5,7)

    val stringToSomething = somePair.asPairOf<String, Any>()
    val stringToInt = somePair.asPairOf<String, Int>()
    val stringToList = somePair.asPairOf<String, List<*>>()
    val stringToStringList = somePair.asPairOf<String, List<String>>() // Compiles but breaks type safety!

    println(stringToSomething)
    println(stringToInt)
    println(stringToList)
    /**
     * stringToStringList: This is the problematic case. The second element is a List<Int>,
     * which is not a List<String>. However, due to the use of reified types and unchecked casts,
     * the compiler doesn't catch this type mismatch.
     * This can lead to runtime exceptions if you try to access elements of the resulting List<String>.
     */
    println(stringToStringList)
//    println(stringToStringList?.second?.forEach() {it.length}) // This will throw ClassCastException as list items are not String

}

inline fun <reified T> Iterable<*>.filterIsInstance() = filter { it is T }

inline fun <reified A,reified B> Pair<*,*>.asPairOf(): Pair<A,B>?{
    if (first !is A || second !is B) return null
    return first as A to second as B
}