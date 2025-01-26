package inline_more

/*
* For lambdas passed to an inline function:
Inlinable lambdas: Used directly in the inline function or passed to another
*  inline function but cannot be stored or passed outside.
Noinline lambdas: Behave like regular lambdas and can be stored, passed, or manipulated.
*/

inline fun example(inlineableLambda: () -> Unit, noinline noinlineLambda: () -> Unit) {
    inlineableLambda() // Allowed: directly using the inlinable lambda.
    noinlineLambda() // Allowed: directly using the noinline lambda.

    // Storing lambdas:
    // val temp = inlinableLambda // ERROR: Cannot store an inlinable lambda.
    val temp = noinlineLambda // Allowed: noinline lambdas can be stored.

    temp() // Call the stored noinline lambda.
}

// Usage:
fun main() {
    example(
        inlineableLambda = { println("Inlineable lambda!") },
        noinlineLambda = { println("Noinline lambda!") }
    )
}
