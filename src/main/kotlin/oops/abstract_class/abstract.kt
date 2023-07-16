package oops.abstract_class

import sealed_class.*

fun main(args: Array<String>) {

    var india= Indian()
    println(india.name)
//    india.getHeight()
    india.eat()
    india.gotoSchool()
}

abstract class Person4{ // you cannot create instance of abstract class

    abstract var name:String
    abstract fun eat() // abstract properties are "Open" by default
    open fun getHeight(){
//        gotoSchool()
    } //AN "open" function ready to be overridden
    fun gotoSchool(){
        println("hello names")
        hamet()
    } // A Normal function: public and final by default

    private fun hamet(){
        println("Private method")
    }
}

class Indian: Person4() {  //Subclass

    override var name: String = "hello"
    override fun eat() {
        println("overridden eat function")
    }

    override fun getHeight() {
        super.gotoSchool()
    }


}