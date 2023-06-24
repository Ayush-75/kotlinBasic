package basic


/*
* This is the main function . Entry point of the application
* */
fun main(args: Array<String>) {
    var name:String = "Steve"

    var personObj = Person()
    personObj.display("Ayush")
}
class Person{
fun display(name:String){
    println(name)
}
}

