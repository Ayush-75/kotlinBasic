fun main() {
    println("Hello World!")

    val test = Test("Ayush", 25)
    val test2 = Test2("Ayush", 25)

    val nak = Test2.nak()
//    nak.mak()


    println(test)
    println(test2)
}

data class Test(val name: String, val id: Int)
class Test2(val name: String) {

    var id = -1;

    init {
        println("name and id of student is $name and $id")
    }

    class nak {
        fun mak() {
            println("kaka")
        }
    }

    constructor(n: String, id: Int) : this(n) {
        this.id = id
    }

    fun numbers(): Int {
        return 50
    }

}