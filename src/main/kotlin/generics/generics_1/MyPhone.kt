package generics.generics_1

//class MyPhone<T: Any?>(val type:T) {
class MyPhone<T: Phone>(val type:T) {
    fun isAndroidPhone(){
        check(type.os == "Android"){
            "Os need to be Android"
        }
        println("Your phone is good to go")
    }
}

fun main(args: Array<String>) {
    val myPhone = MyPhone(Android())
//    val myPhone = MyPhone("Windows")
//    val myPhone2 = MyPhone(null)
    try {
    myPhone.isAndroidPhone()
    }catch (e: Exception){
        println(e.message)
    }

    // Create a ProducerPhone instance with an Android phone
    val producerPhone: ProducingPhone<Phone> = ProducingPhone<Android>(Android())
    println(producerPhone.get().os)
    // not allowed only subtype of phone
//    val producerPhone2: ProducingPhone<Android> = ProducingPhone<Phone>(Phone())

    // Create a ConsumerPhone instance that can consume Android phones
    val consumerPhone:ConsumerPhone<Android> = ConsumerPhone<Phone>()
    consumerPhone.printPhone(Android())

    // Create a ConsumerPhone instance that can consume any Phone
    val consumerPhone2:ConsumerPhone<Phone> = ConsumerPhone()
    consumerPhone2.printPhone(Phone("Windows"))

    osType(Android())
    // Print the OS type of a Windows phone
    osType(Phone("Windows"))

    // Check if the object is of type Phone
    var check = isPhoneType<Phone>(Android())
    println("is this type of phone $check")
}

// Generic function to print the OS type of a phone
fun <T: Phone> osType(type:T){
    println("the os type of phone is : ${type.os}")
}

// Inline function to check if an object is of a specific phone type
inline fun <reified T: Phone> isPhoneType(obj: Any): Boolean{
    return obj is T
}

/**
The reified keyword in Kotlin is used in combination with the inline keyword
to allow the type parameter T to be accessed at runtime.
This is useful for type checks and casts,
which are normally erased at runtime due to type erasure in Java and Kotlin.
By marking a type parameter as reified,
you can use it within the function as if it were a normal class type.*/
