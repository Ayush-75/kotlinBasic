package destructuring_declarations

fun main(args: Array<String>) {


    /**destructuring declaration is only allowed for local variables
    val (name1,age1,grade) = student
    */
    val employee = Employee("Ayush", 24, "IT")
    val (name, age, department) = employee
    println("$name at the age of $age is working in $department department")

    val student = Student("Ayush",24,"A+")
    val (name1,age1,grade) = student

    println("Student $name age $age grade is $grade")

    val (bestName,_,dep) = bestEmployee()
    println("Best employee name is $bestName and department $dep")

    /**
    Things to keep in mind while using destructuring declaration
    Since we don’t use componentN function directly in the destructuring declaration,
    we can’t skip any property. If we don’t need any property to be used,
    the compiler will still extract it but we can avoid it by
    replacing it with an underscore ( _ ) but we can’t skip it.
     */
    var (name3, _, department3) = employee
    println(name3)
    println(department3)

    test3()

    // Destructure the Pair into two variables
    val (sum, difference) = computeSumAndDifference(10, 5)
    println("Sum: $sum, Difference: $difference")

}

data class Employee(val name: String, val age: Int, val department: String)

/**
* How to Enable Destructuring in Normal Classes
To make destructuring work for normal classes,
* you must explicitly declare component1(), component2()*/

class Student(val name: String,val age: Int,val grade:String) {
    operator fun component1(): String {
        return name
    }
    operator fun component2():Int{
        return age
    }
    operator fun component3():String{
        return grade
    }
}

fun bestEmployee():Employee {
    // computations
    return Employee("Ayush",24,"It")
}

data class Collage(val name:String,val department: String,val graduationYear:Int,val Cgpa:Float)

// Variable name 'graduationYear' matches the name of a different component
// If data class property changes often then be careful with naming and structuring
// Use in the case when property is fixed like coordinates longitude and latitude
// Example: val (latitude, longitude) = Coordinates(12.34, 56.78)

// Caution: If you change the number of properties in the data class 'Collage',
// the destructuring declarations using this class will not automatically update.
// You need to manually update all destructuring declarations to match the new structure

fun test3(){
    val (name5, department, graduationYear) = Collage("Ayush" ,"IT",2019,7.0f)
    println("Collage name $name5")
    println("graduation year $department")
    println("Cgpa $graduationYear")
}

fun computeSumAndDifference(a: Int, b: Int): Pair<Int, Int> {
    val sum = a + b
    val difference = a - b
    return Pair(sum, difference) // Return a Pair
}