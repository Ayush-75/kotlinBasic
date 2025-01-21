package generics.more_genrics


fun main() {
    val charSequences = listOf<String>("100", "200", "50", "150")
    val threshold = "150"

    val result = copyWhenGreater(charSequences, threshold.toInt())
    println(result) // Output: [200]
}

fun <T> copyWhenGreater(list: List<T>, threshold:Int): List<String>
        where T : CharSequence,
              T : Comparable<T> {
    return list.filter { it.toString().toInt() > threshold }.map { it.toString() }
}
