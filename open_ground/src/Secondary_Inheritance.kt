fun main(args: Array<String>) {

    var dog = Dog("German", "black")

}

open class Animal {

    var breed: String = ""

    constructor(breed: String) {
        this.breed = breed
        println("From Animal $breed ")
    }
}

class Dog : Animal {

    var color: String = ""
    constructor(breed: String, color: String):super(breed) {
        this.color = color

        println("From Dog $breed and $color")
    }
}