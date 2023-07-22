package higherOrder_lambdas

fun main(args: Array<String>) {

    val program = MyProgram1()

    program.reversed("Ayush") { it.reversed() }
}

class MyProgram1 {

    fun reversed(str:String,myStr:(String)->String){
        val result = myStr(str)    // it.reversed() ==> str.reversed() ==> "hello".reversed() = "olleh"
        println(result)
    }
}