package input_Output

fun main(args: Array<String>) {

    println(" Enter the number to check its odd or even")
    val sun = readln()
    val number:Int? = sun.toIntOrNull()

    if (number != null) {
        if (number % 2==0){
            println("The number is even")
        } else{
            println("The number is odd")
        }
    }else{
        println("Invalid input. Please enter a valid number.")
    }

}