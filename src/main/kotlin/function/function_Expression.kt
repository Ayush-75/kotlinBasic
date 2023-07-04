package function

fun main(args: Array<String>) {

    var largeValue = maxValue(5, 8)
    println(largeValue)
}

fun maxValue(a: Int, b: Int): Int =
    if (a > b) {
        println("$a is greater ")
        a
    } else {
        println("$b is greater")
        b
    }