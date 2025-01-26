package extension_function

fun main(args: Array<String>) {
    BaseCaller().call(Base()) // "Base extension function in BaseCaller"
    DerivedCaller().call(Base()) // "Base extension function in DerivedCaller" - dispatch receiver is resolved virtually
    DerivedCaller().call(Derived()) // "Base extension function in DerivedCaller" - extension receiver is resolved statically
}

open class Base{}
class Derived:Base(){}

/**
 * Dispatch Receiver: This is the instance of the class in which the extension function is defined.
   In your example, BaseCaller and DerivedCaller are the dispatch receivers.

 * Extension Receiver: This is the instance of the class that the extension function is extending.
    In your example, Base and Derived are the extension receivers.
* */
open class BaseCaller{
   open fun Base.printFunctionInfo(){
        println("Base Extension function in BaseCaller")
    }
    open fun Derived.printFunctionInfo(){
        println("Derived Extension function in BaseCaller")
    }

    fun call(b:Base){
        b.printFunctionInfo()
    }

//    fun call(b:Derived){
//        b.printFunctionInfo()
//    }

}

class DerivedCaller:BaseCaller(){

    override fun Base.printFunctionInfo() {
        println("Base extension function in DerivedCaller")
    }

    override fun Derived.printFunctionInfo() {
        println("Derived extension function in Derived caller")
    }
}