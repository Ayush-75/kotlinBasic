package function.extension_function

fun main(args: Array<String>) {

    val str1 = "Hello "

    val str2 = "World "

    val str3 = "Ayush "

    val all = str3.addStr(str1, str2)
    println(all)

    val x: Int = 12
    val y: Int = 15

    println(x.greaterValue(y))

}
//  with extension function you can create your own custom function for class
fun Int.greaterValue(other:Int):Int = if (this>other) this else other

fun String.addStr(st1: String, st2: String): String {

    return this + st1 + st2
}