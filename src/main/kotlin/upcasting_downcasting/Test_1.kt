package upcasting_downcasting

open class Animal1{
    open fun makeNoise(){
        println("Animal noise")
    }
}

class Dog1: Animal1(){
    override fun makeNoise() {
        println("Woof woof")
    }

    fun growl(){
        println("Grrrr")
    }
}

class Cat1: Animal1(){
    override fun makeNoise() {
        println("Meow")
    }
}

fun doAnimalStuff(animal1: Animal1){
    animal1.makeNoise()
//    animal1.growl()  //// we can't call this because growl is not defined in Animal class
//    val myDog= animal1 as Dog1
//    myDog.growl()
    if (animal1 is Dog1){
        val myDog: Dog1 = animal1
        myDog.growl()
    }
}
fun main(args: Array<String>) {
val animal1: Animal1 = Dog1()
    doAnimalStuff(animal1)

    val animal2: Animal1 = Cat1()
    // it will throw class cast expression if you use it without a check
    doAnimalStuff(animal2)

}