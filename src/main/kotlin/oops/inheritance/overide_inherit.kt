package oops.inheritance

fun main(args:Array<String>){
    var dog=Dog1()
    dog.breed="Ayush"
    dog.eat()

    var cat = Cat1()
    cat.eat()


    println("dog color is ${dog.color}")
    println("Cat color is ${cat.color}")

}

open class Animal1{  //Super class
    open var color:String="White"
    open fun eat(){
        println("Eat")
    }
}
class Dog1:Animal1() {     // Derived class
    var breed: String = ""
    override var color:String="Black"
    fun bark() {
        println("Bark")
    }
    override fun eat(){
        super<Animal1>.eat()
        println("Dog is eating")
    }
}
class Cat1:Animal1(){
    var age:Int=-1
    fun meow(){
        println("Meow")
    }
    override fun eat(){
        println("Cat is eating")
    }
}
