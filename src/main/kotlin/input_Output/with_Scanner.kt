package input_Output

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    println("Enter the number to check if it's even or odd:")
//    val num: Int? = scanner.nextInt()
    if (scanner.hasNextInt()) {
        val num: Int = scanner.nextInt()

        if (num % 2 == 0) {
            println("The number is even.")
        } else {
            println("The number is odd.")
        }
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}


/*
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Enter the number to check if it's even or odd:")

    val num: Int = if (scanner.hasNextInt()) {
        scanner.nextInt()
    } else {
        println("Invalid input. Please enter a valid number.")
        return
    }

    if (num % 2 == 0) {
        println("The number is even.")
    } else {
        println("The number is odd.")
    }
}
*/

