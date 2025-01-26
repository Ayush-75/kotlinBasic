package oops.sam


interface AgeDescriber {
    fun ageDescription(person: Human)
}

class Human(val name: String, val age: Int)

class AgeDescriberImplementor : AgeDescriber {
    override fun ageDescription(person: Human) {
        val ageDescriptor = when {
            person.age < 13 -> "Child"
            person.age in 13..19 -> "Teenage"
            person.age in 20..60 -> "Adult"
            else -> "Senior Citizen"
        }

        println("${person.name} is $ageDescriptor and his age is ${person.age}")
    }
}

fun ageDescriber(people: List<Human>, ageDescriber: AgeDescriber) {
    people.forEach { ageDescriber.ageDescription(it) }
}

fun main(args: Array<String>) {
    val person = listOf<Human>(
        Human("Ayush",25),
        Human("Lakasaya",4),
        Human("Ved",18)
    )

    ageDescriber(person,AgeDescriberImplementor())
}