package oops.interfaces

interface Named{
    // In interfaces, we can't set a value to a variable directly.
    // However, we can provide a default value using the get() method.
    // This allows us to define a default implementation for the property.
    // We can access this value by implementing the interface in a class
    // and creating an instance of that class.
    val name: String get() = "No name"
}

class Unknown(): Named

interface Speaker{
    fun speak()
}

interface FarmAnimal: Named, Speaker

class Chicken(override val name: String, var numberOfEggs: Int = 0) : FarmAnimal {
    override fun speak() {
        println("Cluck")
    }
}

class Cow(override val name: String) : FarmAnimal {
    override fun speak() {
        println("Moo!")
    }
}

class Farmer(val name: String) {
    fun greet(animal: FarmAnimal) {
        println("Hello, ${animal.name}!")
        // smart cast
//        if (animal is Chicken){
//            println("I see you ${animal.numberOfEggs} eggs today")
//        }
        //Explicit cast
        // it will throw classCastException if you pass other class than chicken
//        val chicken = animal as Chicken
        val chicken = animal as? Chicken
        chicken?.let { println("I see you ${chicken.numberOfEggs} eggs today") }
        // this animal is casted to chicken so use safecast, so
        // if its not chicken it throws null not class cast exception
        // use this if you are sure class passed inside greet is Chicken
        animal.speak()
    }
}

fun main(args: Array<String>) {
    val farmer = Farmer("Sue")
    farmer.greet(Cow("Cj"))

    val unknown = Unknown()
    println("default name in interface ${unknown.name}")
}