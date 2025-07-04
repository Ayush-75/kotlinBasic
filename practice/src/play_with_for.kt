fun main() {
//
//    fun readInt(prompt: String): Int {
//        while (true) {
//            println(prompt)
//            val input = readln()
//            try {
//                return input.toInt()
//            } catch (e: NumberFormatException) {
//                println("Invalid input. Please enter the valid number")
//            }
//        }
//    }

    // numbers of attempts
    fun readInt(prompt: String,maxAttempts: Int = 3): Int? {
        for (attempts in  1..maxAttempts) {
            println(prompt)
            val input = readln()
            try {
                return input.toInt()
            } catch (e: NumberFormatException) {
                println("Invalid input. Please enter the valid number")
                if (attempts < maxAttempts){
                    println("you have ${maxAttempts - attempts} attempts remaining")
                }
            }
        }
        println("you have exhausted all your attempts so bye")
        return null
    }


    val a: Int? = readInt("Enter first number ")
    if (a == null){
        println("Exiting program due to invalid input for the first number")
        return
    }
    val b: Int? = readInt("Enter second number")
    if (b == null){
        println("Exiting program due to invalid input for the second number")
        return
    }


    val maxValue = if (a > b) a else b

    println("Maximum value is : $maxValue")
}