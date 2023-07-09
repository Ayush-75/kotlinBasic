package oops.interfaces

fun main(args: Array<String>) {

    var button = Button()
    button.onClick()
    button.onTouch()
}

interface MyInterfaceListener { // you cannot create instance of interface class
    var name: String //Properties in interface are abstract by default

    fun onTouch() // Methods in interface are abstract by default

    fun onClick() { // Normal method are public and open by default not final
        println("onClick interface code:Button Clicked")

    }
}

class Button : MyInterfaceListener {
    override var name: String = "Ayush"

    override fun onTouch() {
        println("button was touched")

    }

    override fun onClick() {
        super.onClick()
        println("button was clicked")
    }

}