package oops

fun main(args: Array<String>) {

    var student = Student1("Ayush",10)
    println(student.id)

}

//primary constructor
class Student1(var name: String) {

    var id: Int = -1

    init {
        println("name of the student is $name and id is $id")
    }

    //Secondary constructor
    constructor(name: String, id: Int) : this(name) {
        //body
        //the body of secondary constructor is after init block
        this.id = id


    }
}