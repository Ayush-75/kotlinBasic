package scope_function

//apply scope function
fun main(args: Array<String>) {

    /** Scope Function: 'apply'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'context object'  */


    var person = PersonApply().apply {
        name = "Ayush"
        age = 24
        println(name)
        println(age)
    }

    // Perform some other operations on 'person' object
    // this it.name will update the property in an original object
    person.also {
        it.name = "DudeF"
        println("New name: ${it.name}")     // prints   New name:DudeF
    }
}

class PersonApply{
    var name:String = ""
    var age:Int = 0
}