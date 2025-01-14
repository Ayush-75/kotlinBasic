fun main(args: Array<String>) {

    Customer.take()

}

class Customer{

    companion object {
        fun take(){
            println("Behaves like static")
        }
    }

    init {

    }
}