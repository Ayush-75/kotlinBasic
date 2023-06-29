package input_Output

import java.util.Scanner

fun main(args: Array<String>) {

    // create an object for scanner class
    val number1 = Scanner(System.`in`)
    print("Enter an integer: ")
    // nextInt() method is used to take
    // next integer value and store in enteredNumber1 variable
    val enteredNumber1:Int = number1.nextInt()
    println("You entered: $enteredNumber1")

    val number2 = Scanner(System.`in`)
    print("Enter a float value: ")

    val enteredNumber2:Float = number2.nextFloat()
    println("You entered: $enteredNumber2")

    val booleanValue = Scanner(System.`in`)
    print("Enter a boolean: ")

    val enteredBoolean:Boolean = booleanValue.nextBoolean()
    println("You entered: $enteredBoolean")
}