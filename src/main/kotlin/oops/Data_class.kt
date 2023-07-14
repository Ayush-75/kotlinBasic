package oops

fun main(args: Array<String>) {

    var user1 = User("Ayush",24)
    var user2= User("Golu",24)

    if (user1==user2){
        println("Equal")
    }
    else {
        println("Not Equal")
    }
    var user3 = user2.copy(name = "Backlog")
    println(user3)

}
// if you use data class, so it will compare the data of object
// Data class primary constructor must only have property(val/var)
data class User(var name:String,var id:Int)