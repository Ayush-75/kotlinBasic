package input_Output

fun main(args: Array<String>) {


    print("Enter an Integer value: ")
    val string1 = readln()

// .toInt() function converts the string into Integer
    val integerValue: Int = string1.toInt()
    println("You entered: $integerValue")

    print("Enter a double value: ")
    val string2 = readln()

// .toDouble() function converts the string into Double
    val doubleValue: Double = string2.toDouble()
    println("You entered: $doubleValue")

}