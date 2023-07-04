package oops.inheritance

fun main(args: Array<String>) {

    var dog = Dog3("Black", "Pug")
//    dog.color="Black"

}
// Primary and Secondary constructor in inheritance
open class Animal4 {

    var color: String = ""
   constructor(color: String){ //Super class
       this.color = color
       println("from animal:$color")
   }

}

class Dog3 : Animal4 { // Derived class

    var breed:String = ""
   constructor(color: String,breed: String):super(color){
       this.breed = breed
       println("from Dog:$color and $breed")

   }

}