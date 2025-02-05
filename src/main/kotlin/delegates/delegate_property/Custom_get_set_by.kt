package delegates.delegate_property

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


class FormatDelegate(initialValue: String) : ReadWriteProperty<Any?, String> {
    private var formattedString: String = initialValue.toLowerCase().capitalize()
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

class Person(name: String, lastName: String) {
    var name: String by FormatDelegate(name)
    var lastName: String by FormatDelegate(lastName)
    var updateCount = 0

    override fun toString(): String {
        return "Person(name='$name', lastName='$lastName', updateCount=$updateCount)"
    }
}

fun main() {
    val person = Person("AYUSH","ShrivastAVA")
    person.name = "John"

    println(person)
}