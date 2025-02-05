package delegates.delegate_property

import kotlin.reflect.KProperty

fun main(args: Array<String>) {

    val e = Example()
    println(e.message)
    e.message = "Hello, World"
}

class Example{
    var message: String by LoggerDelegate()
}

/**
* Why Don’t We Pass thisRef and property Ourselves?
These parameters are injected by the Kotlin compiler when you access the delegated property. The compiler automatically provides:

thisRef: The instance of the class where the delegated property is declared.
property: Metadata (like property name, type, etc.) via KProperty<*>.
 */

class LoggerDelegate{
    // 'getValue()' is called when you read the property
    operator fun getValue(thisRef: Any?,property: KProperty<*>): String{
        println("Getting value of ${property.name} for this $thisRef")
        return "Default Message"
    }

    // 'setValue()' is called when you write to the property
    operator fun setValue(thisRef: Any?,property: KProperty<*>,value: String){
        println("setting ${property.name} to '$value' for this $thisRef ")
    }
}

/**
* Explanation:
thisRef refers to the instance (e in this case) that owns the message property.
property (a KProperty instance) represents the message property itself.
Putting It All Together:
KProperty helps you dynamically access and manipulate properties of an object.
thisRef in property delegation provides context to the delegate about which instance's property it is handling.

Analogy:
KProperty:
Think of KProperty as a tag on a jar that helps you read and
possibly write to the jar's contents without knowing the jar details beforehand.
E.g., When you look at a jar's tag, you can read what's inside (value).
If the jar is modifiable, you can also change the contents.

thisRef (in Delegation):
Imagine you have a helper (delegate) who manages multiple jars for several people.
Whenever you ask the helper about a specific jar, thisRef helps the helper know which person's jar you are inquiring about.
E.g., If John asks the helper about his "sugar" jar, thisRef would tell the helper "John's kitchen".

Summary:
KProperty: Used in reflection to inspect and interact with properties dynamically.
thisRef: Used in property delegation to know which instance (class object) a property belongs to.*/