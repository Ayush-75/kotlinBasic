package properties

/*class Student{
    public val hobbies = mutableListOf<String>()

    fun addHobby(hobbyname:String){
        hobbies.add(hobbyname)
    }
}*/

/*
fun main(args: Array<String>) {
    val student = Student()
    student.addHobby("Cricket")

    //Accidental deletion of data: We don't want this
    student.hobbies.remove("Cricket")

    // we don't want this, so we will use backing property
}
*/

// Alternate safe code using backing property

class StudentWithBacking{
    private val _hobbies = mutableListOf<String>()

    val hobbies:List<String>  // backing property immutable
        get() = _hobbies

    fun addHobby(hobbyName:String){
        _hobbies.add(hobbyName)
    }
}

fun main(args: Array<String>) {
    var student = StudentWithBacking()
    student.addHobby("Cricket")
    student.addHobby("Gaming")
    student.addHobby("Boxing")

    student.hobbies.forEach(::println)

    //Below code will not compile
//    student.hobbies.remove("Cricket")
}