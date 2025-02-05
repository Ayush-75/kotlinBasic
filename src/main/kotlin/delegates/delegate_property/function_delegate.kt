package delegates.delegate_property

/* This Kotlin example demonstrates lazy initialization using a lambda.
   The Foo class contains two methods: isValid() for checking validity (non-empty data)
   and doSomething() to perform an action.
   The example() function uses lazy initialization to defer the creation of a Foo instance.
   When memoizedFoo is accessed, computeFoo lambda is executed once, and the result is cached.
   The main function demonstrates how to call example() with a computeFoo lambda.
*/

class Foo(private val data: String) {
    // Checks if the data is not empty, ensuring the Foo instance is valid.
    fun isValid(): Boolean {
        return data.isNotEmpty()
    }

    // An example method to show an action performed on Foo.
    fun doSomething() {
        println("Doing something with data: $data")
    }

    override fun toString(): String {
        return "Foo(data='$data')"
    }
}

// Global condition for demonstration purposes.
// It determines whether the action on memoizedFoo should be executed.
val someCondition = true

// The example function takes a lambda that returns a Foo instance.
// The lazy delegate defers initialization of memoizedFoo until its first access.
fun example(computeFoo: () -> Foo) {
    // Lazy initialization
    val memoizedFoo by lazy(computeFoo)

    // If someCondition is true and the initialized Foo instance is valid,
    // then doSomething() is called.
    if (someCondition && memoizedFoo.isValid()) {
        memoizedFoo.doSomething()
    }

    println("the value inside memoized is $memoizedFoo")
}

fun main() {
    // Call the example function with a lambda for creating a Foo instance.
    // The lambda will be executed only upon the first access to memoizedFoo.
    example {
        println("computeFoo lambda is now called to initialize Foo!")
        Foo("Hello, Lazy Initialization!")
    }
}

/**
 * That's right. When you call memoizedFoo.doSomething(),
 * it forces memoizedFoo to be initialized if it hasn't been already.
 * This is how lazy initialization works:
 *
 * • The first time you access memoizedFoo (whether in isValid(), doSomething(), or any other way),
 * the computeFoo lambda is executed.
 * • The resulting Foo object is stored (cached) inside the Lazy instance backing memoizedFoo.
 * • After that, any further calls to memoizedFoo (like doSomething())
 * will use this same cached Foo object instead of creating a new one.
 *
 * So, calling memoizedFoo.doSomething() triggers the initialization (if not already done),
 * and then doSomething() is called on that initialized Foo object.
* */
