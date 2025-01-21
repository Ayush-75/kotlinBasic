package generics.more_genrics

fun main() {

    val ints = arrayOf(1, 2, 3)
    val any = Array<Any>(3) { "A" }
    copy(ints, any)
    any.forEach(::println)

//    Argument type mismatch: actual type is 'kotlin.String', but 'kotlin.Int' was expected
//    ints[0] = "5"

    val objectArray: Array<Any> = arrayOf("Apple", "banana", "cherry")
    fill(objectArray, "Grape")

    objectArray.forEach(::println)
}

fun copy(from: Array<out Any>, to: Array<out Any>) {
    assert(from.size == to.size)
    for (i in from.indices)
        to[i] == from[i]
}

fun fill(dest: Array<in String>, value: String) {
    for (i in dest.indices) {
        dest[i] = value
    }
}