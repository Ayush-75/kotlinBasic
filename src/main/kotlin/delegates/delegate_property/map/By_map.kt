package delegates.delegate_property.map


class User(val map: Map<String, Any?>){
    val name: String
        get() = map["name"] as String

    val age: Int
        get() = map["age"] as Int


}

// Using `by` keyword to delegate property access to the map, reducing boilerplate code
class User2(val tap: Map<String, Any?>){
    val name: String by tap
    val age: Int by tap
}

fun main() {
    val user = mapOf(
        "name" to "Ayush",
        "age" to 25
    )

    val userResponse = User(user)

    val user2 = User2(mapOf(
        "name" to "Axe",
        "age" to 25
    ))

    println(userResponse.name)
    println(userResponse.age)

    println("================================================")

    println(user2.name)
    println(user2.age)
}