package basic


/*
* This is the main function . Entry point of the application
* */
fun main(args: Array<String>) {
//
    var personObj = Person()
    personObj.name = "Ayush"
    personObj.display()
}
class Person{

    var name:String = ""
fun display(){
    println(name)
}
}

