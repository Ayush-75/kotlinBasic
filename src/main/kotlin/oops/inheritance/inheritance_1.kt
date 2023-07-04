package oops.inheritance

fun main(args: Array<String>) {

    var dog = Dog1()
    dog.breed = "lab-ra"
    dog.color = "black"
    dog.eat()
    dog.bark()

    var cat = Cat1()
    cat.color = "brown"
    cat.age = 7
    cat.eat()
    cat.meow()

 /*   var animal = Animal()
    animal.eat()
    animal.color = "White"*/
}

open class Animal{
    var color:String=""
    fun eat(){
        println("Eat")
    }
}
class Dog: Animal1() {
    var breed:String=""
    fun bark(){
        println("Bark")
    }

}
class Cat:Animal1(){
    var age:Int=-1
    fun meow(){
        println("Meow")
    }

}
