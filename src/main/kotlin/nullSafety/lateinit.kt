package nullSafety

/**
lateinit used only with mutable data type [ var ]
lateinit used only with non-nullable data type
lateinit values must be initialised before you use it

If you try to access lateinit variable without initializing it
then it throws UninitializedPropertyAccessException
 */

fun main() {
    var country = Country()

    country.name = "India"
    println(country.name)
    country.setup()
}

class Country {
    lateinit var name: String
    fun setup() {
        name = "USa"
        println("Country name is $name")
    }

}
