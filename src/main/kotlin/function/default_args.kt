package function



fun main(args: Array<String>) {

    val findVolume = area(5,6)
    println("area is $findVolume")

    //overrides default value
    val overrideVolume = area(5,6,8)
    println("override area is $overrideVolume")


}
//default function
@JvmOverloads  // make this function compatible with java file
fun area(length:Int,breath:Int,height:Int = 10):Int{

    return length*breath*height
}