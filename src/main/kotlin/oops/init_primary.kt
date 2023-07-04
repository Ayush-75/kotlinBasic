package oops

fun main() {

    var student = Student("Ayush")

}
//primary constructor
class Student(var name: String) {
    //    var  name:String = "dummy"
    init {
//        this.name = name
        println("name of the student is $name")
    }
}