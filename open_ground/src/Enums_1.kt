import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

fun main(args: Array<String>) {

    var times = IntArithmetics.PLUS.applyAsInt(5,7)
    println(times)

    // can throw exception if value is not find
    val find = IntArithmetics.valueOf("PLUS")
    println(find)
}

enum class IntArithmetics: BinaryOperator<Int>, IntBinaryOperator{
    PLUS{
    },
    TIMES{
    };

    override fun apply(t: Int, u: Int): Int {
        return t*u
    }
    override fun applyAsInt(t: Int, u: Int): Int {
        return apply(t, u )
    }
}