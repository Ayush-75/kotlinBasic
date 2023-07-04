package function

fun main(args: Array<String>) {

    // we can also assign value in this way
    val volume = findVolume(breath = 6, height = 8, length = 6)
    println("named parameter volume is $volume")

}

fun findVolume(length:Int,breath:Int,height:Int = 10){
    println("Length is $length")
    println("Breath is $breath")
    println("height is $height")
}