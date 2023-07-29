package scope_function

//take a look
// https://chat.openai.com/share/aada434c-3991-4658-8e13-5c2d897464a4
fun main() {

    var person: List<Person>? = listOf<Person>(
        Person("Ayush", "India", 24),
        Person("Axetentor", "Usa", 24),
        Person("Golu", "China", 24)
    )

    var letVariable = person.let {

        it
    }
    println(letVariable)
    letVariable?.forEach(::println)
    println(person?.get(0))


    var alsoVariable = person.also {

    }
//    println(alsoVariable)


    var applyVariable = person.apply {

    }
//    println(applyVariable)


    var withVariable = with(person) {

    }
//    println(withVariable)


    var runVariable = person.run {

    }

//    println(runVariable)
}

// Or simply you can use data class
class Person(var name: String, var nationality: String, var age: Int) {
    override fun toString(): String {
        return "Person(name='$name',nationality = '$nationality',age = '$age')"
    }
}