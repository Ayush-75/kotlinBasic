package generics.generics_1
/*
ConsumerPhone<in T: Phone> means that T can be Phone or any of its supertypes.
The printPhone function takes a parameter of type T, which can be any subtype of Phone.
*/
class ConsumerPhone<in T: Phone>() {
    fun printPhone(phone:T){
        println(phone.os)
    }
}

/*
* In Kotlin, the in keyword is used to declare a type parameter as contravariant.
* Contravariant types can only be consumed (passed as arguments or assigned) and not produced (returned).
*  This ensures type safety by preventing the production of the contravariant type.*/