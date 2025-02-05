package delegates.delegate_property

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class FormatDelegate2( private var formattedString: String) : ReadWriteProperty<Any?, String> {
//    private var formattedString: String = " "

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        // Always return the formatted string
        return formattedString
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        formattedString = value.toLowerCase().capitalize()
        // Increment updateCount if thisRef is Person
        if (thisRef is Person) {
            thisRef.updateCount++
        }
    }
}

class Person2(name: String, lastName: String) {
    var name: String by FormatDelegate2(name)
    var lastName: String by FormatDelegate2(lastName)
    var updateCount = 0

    override fun toString(): String {
        return "Person(name='$name', lastName='$lastName', updateCount=$updateCount)"
    }
}

fun main() {
    val person = Person2("AYUSH","ShrivastAVA")
    person.name = "JohNN"

    /*
    * The lastName property is not formatted because it is not being modified after initialization.
    * The FormatDelegate2 class formats the value when it is set,
    *  but since lastName is not being set to a new value after the Person2 object is created,
    *  it remains as it was initialized.*/

    println(person)
}