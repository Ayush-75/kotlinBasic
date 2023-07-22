package higherOrder_lambdas

fun main() {

    /**    val person2 = with(Person2("Ayush", 24)) {
    name = "Ksi"
    println(name)
    println(age)
    startRun()
    takeIt()
    }

    val  person3 = Person2("Axtentor",24).apply {
    name = "Ayush"
    println(name)
    println(age)
    startRun()
    takeIt()
    }*/

    val person2 = Person2()

    with(person2) {  // you cannot call method
        name = "Ayush"
        age = 22
    }

    person2.apply {  // Has a right to call these methods like start to run
        name = "Ayush"
        age = 22
    }.startRun()

    person2.apply {// pass more than more function with this way
        name = "axtentor"
        age = 24
    }.apply {
        startRun()
        takeIt()
    }

    println(person2.name)
    println(person2.age)


}
//class Person2(var name:String,var age:Int){

class Person2 {
    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("I am Ready to run")
    }

    fun takeIt() {
        println("the name and age is $name $age")
    }

}
