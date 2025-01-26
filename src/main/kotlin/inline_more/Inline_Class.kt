package inline_more

@JvmInline
value class Width(val width: Long)
@JvmInline
value class Height(val height: Long)
//inline class Height(val height: Long)

class Rectangle(private val width: Width, private val height: Height){

    fun printRec(){
        println("${this.width} , ${this.height}")
    }
}

fun main(args: Array<String>) {
    val width = Width(10)
    val height = Height(50)

//    val rectangle = Rectangle(height,width)
    val rectangle = Rectangle(width,height)
    rectangle.printRec()
}
/**

Value classes in Kotlin, introduced with the `@JvmInline` annotation,
are a way to create classes that wrap a value but do not incur the overhead of an additional object allocation.
They are useful for performance optimization and type safety.

### Problems Solved by Value Classes:
1. **Performance Overhead**: Traditional classes in Kotlin create an additional object on the heap,
which can be costly in terms of memory and performance. Value classes avoid this by being inlined at runtime.
2. **Type Safety**: Value classes provide a way to create distinct types for different values,
even if they have the same underlying type. This helps prevent errors where values of the same type are used interchangeably.

### Use Cases:
1. Wrapping Primitive Types**: When you need to wrap primitive types (like `Int`, `Long`, etc.)
to provide additional type safety without the overhead of object allocation.
2. Domain-Specific Types**: Creating domain-specific types that are more meaningful than
primitive types, e.g., `Width`, `Height`, `UserId`, etc.
3. Optimizing Performance**: In performance-critical applications where reducing memory
allocation and garbage collection overhead is important.

### Example:
In the provided code, `Width` and `Height` are value classes that wrap a `Long` value.
This ensures that `Width` and `Height` are distinct types, preventing accidental misuse
, and also avoids the overhead of creating additional objects.

```kotlin
@JvmInline
value class Width(val width: Long)

@JvmInline
value class Height(val height: Long)
```

In the `Rectangle` class, these value classes are used to ensure
that the width and height are correctly typed and optimized for performance.

```kotlin
class Rectangle(private val width: Width, private val height: Height) {
    fun printRec() {
        println("${this.width} , ${this.height}")
    }
}
```

In summary, value classes are useful for creating lightweight,
type-safe wrappers around values, optimizing performance by avoiding unnecessary object allocations.*/
