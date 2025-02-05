package delegates.delegate_property

import kotlin.reflect.KProperty


class LoggingDelegate<T>(private var value: T) {
    // 'getValue()' is called when you read the property
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        println("Accessed ${property.name} in $thisRef")
        return value
    }

    // 'setValue()' is called when you write to the property
    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: T) {
        println("Updated ${property.name} from $value to $newValue in $thisRef")
        value = newValue
    }
}

class MyClass {
    var name: String by LoggingDelegate("InitialValue")
}

fun main() {
    val obj = MyClass()
    obj.name = "NewValue"  // <- You don't pass thisRef or property here! it's set by kotlin compiler
    println(obj.name)
}
