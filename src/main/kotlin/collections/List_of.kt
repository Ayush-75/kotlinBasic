package collections

// list
fun main(args: Array<String>) {

    var list = listOf<String>("Ayush","Akash","Golu","Uma") // Immutable. Fixed Size. Read only

    for (elements in list){
        println(elements)
    }

    println()

    for (index in 0..list.size - 1) {
        println(list[index])
    }

    println()

    list.forEach(::println)
}