package iterators

fun main(args: Array<String>) {

    var i:Int = 1
    do {
        if (i%2==0){
            println(i)
        }
        i++
    }while (i<=10)

    println("-------------------------------")

    var j:Int = 1
    do {
        if (j%2==0){
            j++
            continue
        }
        println(j)
        j++
    }while (j<=10)
}