package scope_function

// Run
fun main(args: Array<String>) {

    /** Scope Function: 'run'
    Property 1: Refer to context object by using 'this'
    Property 2: The return value is the 'lambda result'
    'run' is combination of 'with' and 'let'
    If you want to operate on a Nullable object and avoid NullPointerException then use 'run'

     */

    val person:PersonRun? = null

    val bio = person?.run {
        name = "Ayush"
        age = 24
        println(name)
        println(age)
        age+5
        "Hello world" // this will be stored in bio

    }
    println(bio)
}

class PersonRun{
    var name:String = ""
    var age:Int = 0
}