package generics.more_genrics

fun main(args: Array<String>) {

    var list = listOf("Ayush",5,6,7,8.7,"Axe", listOf("FAk"))
//    takeAny(list)

   println( list.filterInstance<Int>())

}

fun takeAny(list: List<*>){
    list.forEach(::println)
}

inline fun <reified T> Iterable<*>.filterInstance() = filter { it is T }