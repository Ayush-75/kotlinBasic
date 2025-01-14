package higherOrder_lambdas

/**
* The invoke method provides a bit more flexibility and can be useful in certain contexts:

* Consistency: When building DSLs (Domain-Specific Languages) or APIs,
explicit use of invoke can sometimes make the intention clearer.
* Interoperability: If you are working with reflection or when dynamically
invoking functions, using invoke might be more explicit and safer.
* Override Capability: If you are defining your own function-like classes,
 you can provide customized behavior by overriding the invoke operator.
 */

class Counter {
    private var i = 0
    operator fun invoke(): Int {
        return i++
    }
}

fun main() {
    val counter = Counter()

    println(counter.invoke())  // Calls the operator fun, prints 0
    println(counter())         // Also calls the operator fun, prints 1
    println(counter.invoke())  // Calls the operator fun, prints 2
    println(counter())         // Also calls the operator fun, prints 3
}
