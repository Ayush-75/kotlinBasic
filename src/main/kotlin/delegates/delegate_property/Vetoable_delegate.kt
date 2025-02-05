package delegates.delegate_property

import kotlin.properties.Delegates

class VetoableExample {
    var vetoableProperty: Int by Delegates.vetoable(12) { property, oldValue, newValue ->
       println("oldValue : $oldValue")
       println("newValue : $newValue")

        newValue >= 15 // if this condition is satisfied, then it will assign value
    }
}

fun main() {
    val example = VetoableExample()
    example.vetoableProperty = 15  // Change is allowed
    example.vetoableProperty = -5  // Change is vetoed
    println("value of vetoable property ${example.vetoableProperty}")
}
