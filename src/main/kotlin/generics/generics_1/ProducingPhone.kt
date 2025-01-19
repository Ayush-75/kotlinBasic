package generics.generics_1
// The `out` keyword makes the type covariant, allowing T to be a subtype of Phone
class ProducingPhone<out T: Phone>(val phone:T) {

    // Stores the phone instance of type The
    val value:T = phone

    // Returns the phone instance of type T
    fun get():T{
        return phone
    }

    // not allowed
//    fun getBodyType(another:T):T {
//        return phone
//    }

    // not allowed
//    var value:T = phone

    // Not allowed: function parameter cannot be covariant
    // fun set(another: T) {
    //     this.phone = another
    // }
}

/*
* In Kotlin, the out keyword is used to declare a type parameter as covariant.
*  Covariant types can only be produced (returned) and not consumed (passed as arguments or assigned).
*  This ensures type safety by preventing the modification of the covariant type.*/