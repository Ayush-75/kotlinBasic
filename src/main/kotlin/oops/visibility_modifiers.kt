package oops

fun main() {
    var indian = Indian()
    var person = Person()
//    person.c = 5

}

class TestClass {

    fun testing() {

        /*a,b is not visible
         c ,d are visible*/

        val person = Person()
        println(person.c)
        println(person.d)
    }
}

open class Person { //Super Class

    private val a = 1
    protected val b = 2
    internal var c = 3
        //setter is visible only in Person class
        private set /*  this means -> This means that the value of bar can be modified only 
        within the file where it is declared,
         and it cannot be modified from other files or classes outside of the current file.*/
         
    public var d = 4 // public by default
        private set
}

class Indian : Person() {

    /*a is not visible
    b and c ,d are visible*/
    fun test() {
//        println(a) // not visible


        println(d)
        println(c)
        println(b)
    }
}