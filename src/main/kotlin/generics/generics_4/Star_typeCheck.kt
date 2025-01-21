package generics.generics_4

fun main(args: Array<String>) {

    val listOfInts = listOf(5,7,8,9,1)
    val listOfChar = listOf('a','s','b')
    val name = "Ayush"

    // This will not compile due to type erasure
     if (listOfInts is List<Int>) {
         println("df")
     }

    // Using star-projection to check the type
    checkList(listOfInts)
    println()
    checkList(listOfChar)
    checkList(name)

}

fun checkList(someThing: Any){
    if (someThing is List<*>){
        // The items are treated as `Any?`
        someThing.forEach(::println)
    }else
        println("Not a list")
}