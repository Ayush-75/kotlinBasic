package higherOrder_lambdas

fun main(args: Array<String>) {

    rollDice(1..6,4) { ayush -> println(ayush) }


}

fun rollDice(range:IntRange,time:Int,action:(Int)->Unit){
    for (i in 0 until time){
        val result = range.random()
        action(result)
    }
}
