package equals

fun main(args: Array<String>) {

    // Creating instances of the Yee class
    var yee = Yee("Ayush",25)
    var yee2 = Yee("Ayush",25)

    // Creating instances of the Student data class
    var student = Student("Ayush",25)
    var student2 = Student("Ayush",25)

    // Checking equality using the equals() method
    println("checks with equal function ${yee.equals(yee2)}") // true because we override equals method
    // Checking equality using the '==' operator
    println("checks with  == ${yee == yee2}") // true because '==' calls the equals() method
    // Checking referential equality using the '===' operator
    println("check object reference ${yee === yee2}") // false because they are different instances

    println("======================== with data class ============================")

    // Checking equality using the equals() method for data class
    println("checks with equal function ${student.equals(student2)}") // true because data class auto-generates equals method
    // Checking equality using the '==' operator for data class
    println("checks with  == ${student == student2}") // true because '==' calls the equals() method
    // Checking referential equality using the '===' operator for data class
    println("check object reference ${student === student2}") // false because they are different instances
}


// Regular class Yee
class Yee(var name: String, var id: Int) {
    // Overriding equals method to check structural equality
    override fun equals(other: Any?): Boolean {
        if (this === other) return true // Referential equality
        if (other !is Yee) return false // Check if the other object is of type Yee
        return name == other.name && id == other.id // Check structural equality
    }

    // Overriding hashCode method to maintain consistency with equals
    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        return result
    }
}
// Data class Student
data class Student(var name: String,var id: Int)

/**
In Kotlin, the == operator checks for structural equality by calling the equals() method,
while the === operator checks for referential equality (i.e., whether two references point to the same object).

For regular classes, you need to override the equals() and hashCode() methods to check for structural equality.
Data classes in Kotlin automatically generate these methods based on the primary constructor properties,
making it easier to compare objects based on their data
*/
