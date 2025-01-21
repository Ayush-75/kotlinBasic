package generics.more_genrics

fun main(args: Array<String>) {

    var list = arrayListOf(5,7,8,9,5,4,6)
    findElement(list,5)

//    val word = arrayListOf("ays", "jds", "jdk")
//    findElement(word, "")

//    println(findEle(list,5))
}

fun <T> findElement(array: ArrayList<T>, element: T) {
    var found = false
    var count = 0
    for (i in array.indices) {
        if (array[i] == element) {
            count++
            println("the element $element found in array at position $i")
            found = true
        }
    }
    println("the element $element occurs $count times in the array")
    if (!found) {
        println("sorry, element $element not found")
    }
}

fun <Y> findEle(list: List<Y>,element: Y):String{
    val index = list.indexOf(element)
    return if (index!=-1){
        "The element $element found in list at position $index"
    }else{
        "Sorry, element $element not found"
    }
}