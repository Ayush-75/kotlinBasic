package enums

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

fun main(args: Array<String>) {

    val a = 10
    val b = 15

    for (f in IntArithmetics.values()){
        println("$f($a,$b) = ${f.applyAsInt(a,b)}")
    }
}

enum class IntArithmetics : BinaryOperator<Int>, IntBinaryOperator {

    Plus {
        override fun apply(t: Int, u: Int): Int = t + u
    },
    Times {
        override fun apply(t: Int, u: Int): Int = t *  u
    };
    override fun applyAsInt(t:Int, u:Int): Int = apply(t,u)
}