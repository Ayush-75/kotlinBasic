package randomExp

fun main(args: Array<String>) {
    // Ranges

    val r1 = 1..10
    val r2 = (1..10).filter { it % 2 == 1 }.reversed()

//    r2.forEach { println(it) }

    println("Enter your 1st number")
    var i: Int = readln().toInt()
    println("Enter your 2nd number")
    var j: Int = readln().toInt()
    do {
        if (i % 2 == 1)
            println(i)
        i++
    } while (i <= j)

}