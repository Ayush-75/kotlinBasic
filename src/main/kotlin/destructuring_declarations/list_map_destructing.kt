package destructuring_declarations

fun main() {

    test1()
    test2()

}

/** it only works till component 5 after that you need to specify
 * it explicitly component 6
 */

fun test1(){
    val (a,b,c,d,e,f) = listOf(1,2,3,4,5,6)
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)


}
// you can use extension function on component to your desired result
operator fun <T> List<T>.component2():List<T> = drop(1)

operator fun <E> List<E>.component6(): E {

    return get(5)
}

fun test2(){
    val map = mapOf("1" to "one", "2" to "two","3" to "three")

    for ((key,value ) in map){
        println("key : $key , value : $value")
    }

    println(map.mapValues { (key,value) -> "$key-$value" })
    println(map.mapValues { entry: Map.Entry<String, String> -> "${entry.key}-${entry.value}" })

    val mapOf1 = mapOf("1" to "one" to "I", "2" to "two" to "II","3" to "three" to "III")
    mapOf1.forEach(::println)

}






