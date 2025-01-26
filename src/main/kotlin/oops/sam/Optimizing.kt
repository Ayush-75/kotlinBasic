package oops.sam

data class HumanData(val name:String,val age:Int)

fun describeAges(people:List<HumanData>, ageDescriber:(HumanData)->Unit){
    people.forEach{ageDescriber(it)}
}

fun main(args: Array<String>) {
    val data = listOf<HumanData>(
        HumanData("Ayush",25),
        HumanData("mad",8),
        HumanData("president",55)
    )

    describeAges(data){person ->
        val ageCategory = when{
            person.age < 13 -> "Child"
            person.age in 13..19  -> "Teenager"
            person.age in 20..60 -> "Adult"
            else -> "Senior citizen"
        }

        println("${person.name} is a $ageCategory and is age is ${person.age} years old")
    }
}
