package function.extension_function

fun main(args: Array<String>) {

    val student = Student()
    println("Pass Status : ${student.isPassed(45)}")
    println("Scholarship  Status : ${student.gotScholarship(45)}")

}

fun Student.gotScholarship(marks: Int):Boolean{
    return marks>95
}

class Student{
    fun isPassed(marks:Int):Boolean{
        return marks > 40
    }
}