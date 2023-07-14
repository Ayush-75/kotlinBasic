package oops.singleton

fun main() {

    CustomerData.count = 98
    println(CustomerData.count)

    CustomerData.typeOfCustomer()
    CustomerData.myMethod("Ayush")

}
open class MySuperclass(){
    open fun myMethod(str:String){
        println("My Superclass")
    }
}
object CustomerData:MySuperclass(){
    var count:Int=1 // behaves like static variable
    fun typeOfCustomer():String{ // behaves like static method
        return "Indian"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
        println("Object CustomerData: $str")
    }
    init {
        //your code
        println("Hellox")
    }

}