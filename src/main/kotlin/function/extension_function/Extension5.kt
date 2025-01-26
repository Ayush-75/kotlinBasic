package extension_function

data class User(val name:String?, val middleName:String?, val lastName:String?)
/** Note that extensions can be defined with a nullable receiver type.
 These extensions can be called on an object variable even if its value is null. If the receiver is null,
  then this is also null. So when defining an extension with a nullable receiver type,
 we recommend performing a this == null check inside the function body to avoid compiler errors.*/

fun User?.fullName():String{
    if (this == null) return "No User"
    val middle = middleName?.let { " $it" } ?: ""
    val last = lastName?.let { " $it" } ?: ""

    return "$name$middle $last"
}

fun main(args: Array<String>) {
    val user1 = User("Ayush","kb","Sh")
    val user2 = User("Axe",null,null)
    val user3 = null

    println(user1.fullName())
    println(user2.fullName())
    println(user3.fullName())
}