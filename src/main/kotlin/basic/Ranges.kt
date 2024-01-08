package basic

fun main(args: Array<String>) {

    // Ranges

    val r1 = 1..10
    val ispresent = 5 in r1
    println(ispresent)

    var r2 = 5 downTo 1 //the range contains the number 5,4,3,2,1
    var r3 = 5 downTo 1 step 2 // the range contains the number 5,3,1
    var r4 = 'a'..'z' // the range contains the values from a to z

    var r7 = 'z'.downTo('a') step 2 // the range contains the values from z to a with step2

    var isPresent = 'c' in r4 //check if c is present

    var countDown = 20.downTo(1) //the range contains the number 20 to 1
    var moveUp = 1.rangeTo(20) //the range contains the number 1 to 20

    //ranges
    var r5 = (5 downTo 1).filter { it % 2 == 0 }
    var r6 = (5 downTo 1).reversed()

    println(r5)
    r6.forEach { println(it) }

    println("-----------------------------------------")

    // print ranges with for loop

    for (i in r1) {
        println(i)
    }

    println("-----------------------------------------")

    //print ranges with while loop
    var i = r1.first
    while (i <= r1.last) {
        println(i)
        i++
    }

    println("-----------------------------------------")

    //print ranges with do wile loop
    var j = r1.first
    do {
        println(j)
        j++
    } while (j <= r1.last)
}
