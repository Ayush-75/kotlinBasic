package generics.more_genrics

/*
* The underscore operator _ can be used for type arguments.
*  Use it to automatically infer a type of the argument when other types are explicitly specified: */

abstract class SomeClass<T> {
    abstract fun execute() : T
}

class SomeImplementation : SomeClass<String>() {
    override fun execute(): String = "Test"
}

class OtherImplementation : SomeClass<Int>() {
    override fun execute(): Int = 42
}

object Runner {
    inline fun <reified S: SomeClass<T>, T> run() : T {
        return S::class.java.getDeclaredConstructor().newInstance().execute()
    }
}

fun main() {
    // T is inferred as String because SomeImplementation derives from SomeClass<String>
    val s = Runner.run<SomeImplementation, _>()
    assert(s == "Test")

    // T is inferred as Int because OtherImplementation derives from SomeClass<Int>
    val n = Runner.run<OtherImplementation, _>()
    assert(n == 42)

    // Explicitly specify type for the first type argument, let the second be inferred
    val result = doSomething<Int, _>(42, "Hello")

    println(result) // Output: (42, Hello)


}

fun <A, B> doSomething(a: A, b: B): Pair<A, B> {
    return Pair(a, b)
}

