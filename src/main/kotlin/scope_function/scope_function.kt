package scope_function

fun main() {

    var letVariable = Person1("Axe", "Poland", 24).let {currentPerson ->

        currentPerson.name + currentPerson.age
    }
    println("Let : $letVariable")


    var alsoVariable = Person1("Axe", "Poland", 24).also {
        it.name + it.age
    }
    println("also : $alsoVariable")


    var applyVariable = Person1("Axe", "Poland", 24).apply {
//        this.name + this.age
    }
    println("apply : $applyVariable")


    var withVariable = with(Person1("Axe", "Poland", 24)) {

        this.name + this.age

    }
    println("with : $withVariable")

    var runVariable = Person1("Axe", "Poland", 24).run {
        this.name + this.age

    }
    println("run : $runVariable")
}

data class Person1(var name: String, var nationality: String, var age: Int) {}