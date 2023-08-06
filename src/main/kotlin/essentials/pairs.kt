package essentials

fun main(args: Array<String>) {

    val equipment = "fishnet" to "catching fish"
    println(equipment.first)
    println(equipment.second)

    val moreEquipment = ("Fishnet" to "Catching fish") to ("of big size" to "Strong")
    println(moreEquipment)
    println(moreEquipment.first.second)
    println(moreEquipment.component2())

    val (tools, use) = equipment
    println("The $tools is tool for $use")

    println(tools)
    println(use)

    val fishnetString = equipment.toString()
    println(fishnetString)

    println(equipment.toList())


}

/**
 * In programming, we call functions to perform a particular task.
 * The best thing about function is that we can call it any number of times and it return some value after computation
 * i.e. if we are having add() function then it always returns the sum of both the numbers entered.
 *
 * But, functions has some limitations like function return only one value at a time.
 * If there is need to return more than one value of different data type,
 * then we can create a class and declare all the variables
 * that we want to return from the function and after that create an object of the class and easily collect all
 * the returned values in a list. The main problem is that if there are so many functions in
 * the program which returns more than one value at a time then we have to create a separate class
 * for all those functions and finally use that class.
 * This process increases the verbosity and complexity of the program.
 *
 * In order to deal with these type of problems, Kotlin introduced the concept of Pair and Triple.
 *
 * What is Pair? –
 * Kotlin language provides a simple datatype to store two values in a single instance.
 * This can be done using a data class known as Pair.
 * It is a simple generic class that can store two values of same or different data types,
 * and there can or can not be a relationship between the two values.
 * The comparison between two Pair objects is done on the basis of values,
 * i.e. two Pair objects are equal if their values are equal.
 */