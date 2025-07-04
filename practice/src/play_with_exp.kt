fun main() {

    var a: Int
    var b: Int
    var attemptsA = 0
    val maxAttempts = 5

    while (true){
        println("Enter the first number:")
        try {

            a = readln().toInt()
            break
        }catch (e: NumberFormatException){
            attemptsA++
            if (attemptsA >= maxAttempts){
                println("Maximum number of attempts reached for first number")
                println("its seems like you are not serious")
                return
            }
            println("Invalid input. Please enter the valid number")
        }
    }

    var attemptsB = 0
    while (true){
        println("Enter the Second number:")
        try {

            b = readln().toInt()
            break
        }catch (e: NumberFormatException){
            attemptsB++
            if (attemptsB >= maxAttempts){
                println("Maximum number of attempts reached for second number")
                return
            }
            println("Invalid input. Please enter the valid number")
        }
    }


    val maxValue = if (a>b) a else b

    println("Maximum value is : $maxValue")
}