package properties

import java.lang.Exception

fun main(args: Array<String>) {

    var person = Person()
    person.firstname = "Ayush"
    person.lastname = "Axe"
    person.age = 18

    println("Full name of person is ${person.firstname} ${person.lastname}")

}

class Person{
    var firstname: String? = null
        get() {
//            println("getter for firstname is getting invoked")
            return field
        }
        set(value) {
//            println("setter for firstname is getting invoked")
            field = value?.uppercase()
        }

    var lastname: String? = null
        get() {
//            println("getter for lastname is getting invoked")
            return field
        }
        set(value) {
//            println("setter for lastname is getting invoked")
            field = value?.uppercase()
        }

    // setting custom property on get()
/*    var age:Int? = null
        get() {
            if (field?.compareTo(18)!!<0){
                throw Exception("Person is minor")}
            else {
                return field
            }
        }*/

    // setting custom property on set()
    var age:Int? = null
        set(value) {
            if (value?.compareTo(18)!!<0){
                throw Exception("Person is minor")
            }
            else {
                field = value
            }
        }
        get() = field
}