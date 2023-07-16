package sealed_class

sealed interface ClickableItem

// Sealed class representing different device items
sealed class DeviceItem(val name: String) : ClickableItem {
    object Camera : DeviceItem("Camera") // Subclass representing a camera item
    object Lamp : DeviceItem("Lamp") // Subclass representing a lamp item
    // ... etc, more devices
}

// Function to handle the clicked event on device items
fun onDeviceItemClicked(item: ClickableItem) {
    when (item) {
        is DeviceItem.Camera -> {
            println("Camera clicked")
        }
        is DeviceItem.Lamp -> {
            println("Lamp clicked")
        }
    }
}

fun main() {
    val cameraItem: ClickableItem = DeviceItem.Camera // Create an instance of Camera item
    val lampItem: ClickableItem = DeviceItem.Lamp // Create an instance of Lamp item

    onDeviceItemClicked(cameraItem) // Output: Camera clicked
    onDeviceItemClicked(lampItem) // Output: Lamp clicked
}