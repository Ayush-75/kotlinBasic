package extension_function

fun main(args: Array<String>) {

    val list = mutableListOf(0,5,7,8,1,2)
    list.swap(5,0)
    list.forEach(::println)

    println()
    println(list[list.lastIndex])

    val name = mutableListOf("Ayush","Axe","Billionaire")
    name.swap(0,2)
    name.forEach(::println)

}

fun<T> MutableList<T>.swap(index1:Int,index2:Int){
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

// extension properties
val <T> MutableList<T>.lastIndex:Int
    get() = size-1