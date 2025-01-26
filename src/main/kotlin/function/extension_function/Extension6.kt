package extension_function

class MyClass{
    companion object{}
}

fun MyClass.Companion.printCompanion(){
    println("companion")
}

fun main(args: Array<String>) {
    MyClass.printCompanion()
}