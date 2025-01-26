package type_check_casting

class Cat {
    fun purr() {
        println("Purr purr")
    }
}

fun petAnimal(animal: Any) {
    val isCat = animal is Cat
    if (isCat) {
        // The compiler can access information about
        // isCat, so it knows that animal was smart-cast
        // to the type Cat.
        // Therefore, the purr() function can be called.
//        animal.purr()

    }
}

fun main(){
    val kitty = Cat()
    petAnimal(kitty)
    // Purr purr
}