
package iterators

fun main(args: Array<String>) {
// break statement
    for (i in 1..10){
        println(i)
        if (i==5){
            break
        }
    }
}