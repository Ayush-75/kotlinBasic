package inline_more


fun main(args: Array<String>) {

    message({ println("Its inline message") }, { println("noinline function message") }
        // this look like a local return, but it's not its non-local return its main function return
//        return
    )


    message(
        {
            println("Its second inline message")
            // if you use crossinline, it will make sure you don't use nonlocal return
            // inside a lambda
            return@message
        },

        { println("noinline function second message") })
}

//inline fun message(a:()-> Unit){
//    a()
//}
// Using crossinline prevents non-local returns from the lambda
// you need to make that return labeled
inline fun message(crossinline a:()-> Unit , noinline b:()-> Unit){
    a()
    // Using noinline allows the lambda to be stored or passed around.
    // It behaves like a regular lambda and is not inlined at the call site.
    b() // This lambda will not be inlined.
}