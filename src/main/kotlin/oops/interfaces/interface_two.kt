package oops.interfaces

fun main(args:Array<String>){

    var button=MyButton()
    button.onClick()
    button.onTouch()
}
interface MyInterfaceListener1{   // you cannot create instance of interface class

    //    var name:String //Properties in interface are abstract by default
    fun onTouch()   // Methods in interface are abstract by default
    fun onClick(){  // Normal method are public and open by default not final
        //your code
        println("onClick Interface code:button clicked")
    }
}
interface MySecondInterface{   // you cannot create instance of interface class


    fun onTouch() { //Normal method
        println("My second Interface:onTouch")
    }
    fun onClick(){  // Normal method are public and open by default not final
        //your code
        println("MySecondInterface code:onclick")
    }
}

class MyButton() :MyInterfaceListener1,MySecondInterface{ // if you apply both interface listener in class
    // if they have same method then you have to override that
    //    override var name: String="PUSH"
    override fun onTouch() {
        super.onTouch() // It will call method which has a body
        // if both onTouch has body then compiler will be confused
        // So you have to provide which method it should call super<which class method>.onclick
    }

    override fun onClick() {
        super<MyInterfaceListener1>.onClick()
        super <MySecondInterface>.onClick()
    }

}

