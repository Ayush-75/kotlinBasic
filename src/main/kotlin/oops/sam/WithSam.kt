package oops.sam


fun interface AgeDescriber1 {
    fun ageDescription1(person1: Human1)
}

class Human1(val name: String, val age: Int)

fun ageDescriber1(people1: List<Human1>, ageDescriber1: AgeDescriber1) {
    people1.forEach { ageDescriber1.ageDescription1(it) }
}

fun main(args: Array<String>) {
    val person1 = listOf<Human1>(
        Human1("Ayush",25),
        Human1("Lakasaya",4),
        Human1("Ved",18)
    )

    ageDescriber1(person1) {
        val ageDescriptor1 = when {
            it.age < 13 -> "Child"
            it.age in 13..19 -> "Teenage"
            it.age in 20..60 -> "Adult"
            else -> "Senior Citizen"
        }

        println("${it.name} is $ageDescriptor1 and his age is ${it.age}")
    }
}