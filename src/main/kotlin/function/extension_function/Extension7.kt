package extension_function

fun main(args: Array<String>) {

    Connection(Host("kotl.in"), 443).connect()

//    Host("kotl.in").printConnectionString()  // error, the extension function is unavailable outside Connection
}
/**You can declare extensions for one class inside another class.
Inside such an extension, there are multiple implicit receivers - objects whose members can be accessed without a qualifier.
An instance of a class in which the extension is declared is called a dispatch receiver,
and an instance of the receiver type of the extension method is called an extension receiver.*/

class Host(val hostname: String) {
    fun printHostname() { print(hostname) }
    fun tax(){
        println("\nFile your itr Host")
    }
}

class Connection(val host: Host, val port: Int) {
    fun printPort() { print(port) }

    fun tax(){
        println("\nfile your itr connection")
    }

    fun Host.printConnectionString() {
        printHostname()   // calls Host.printHostname()
        print(":")
        printPort()   // calls Connection.printPort()
        tax() //calls Host.toString()
        this@Connection.tax()  // calls Connection.tax
    }

    fun connect() {
        /*...*/
        host.printConnectionString()   // calls the extension function
    }
}