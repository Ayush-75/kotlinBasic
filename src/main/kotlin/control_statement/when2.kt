package control_statement

fun main() {
    val x = readlnOrNull()

    when (x.toString()) {
        in "1".."19" -> println("in 1 to 19 range")
        "20" -> println("x is 20")
        "2" -> println("x is 2")
        else -> println("I don't know x")
    }
}
