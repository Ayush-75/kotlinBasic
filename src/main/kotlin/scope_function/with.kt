package scope_function

// With Scope function
fun main(args: Array<String>) {

    /** Scope Function: 'with'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'  */

    val person = PersonWith()
    var bio:String = with(person) {
        name = "Axe"
        age = 25
        println(name)
        println(age)
        val ageAfter5year = age+5
        println("age after 5 years $ageAfter5year")
        "Ayush"

    }

    println(person.name)
    println(bio)
}

class PersonWith(){
    var name:String ="Ayush"
    var age:Int = 24
}