package iterators

fun main(args: Array<String>) {

    var num:Int = 1
    while (num<=10){
        if (num%2==0){
            println(num)
        }
            num++
    }

    println("------------------------------------------")

    var i:Int = 1
    while (i<=10){
        if (i%2==0){
            i++
            continue
        }
            println(i)
        i++
    }
}