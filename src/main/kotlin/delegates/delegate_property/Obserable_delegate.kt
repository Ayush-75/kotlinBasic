package delegates.delegate_property


import kotlin.properties.Delegates

class ObservableExample {
    var observableProperty: String by Delegates.observable("Initial Value") { property, oldValue, newValue ->
        println("Property ${property.name} changed from oldValue -> $oldValue to newValue -> $newValue")
    }
}

fun main() {
    val example = ObservableExample()
    example.observableProperty = "Ayush"
    example.observableProperty = "Axe"
}
