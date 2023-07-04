
@file:JvmName("MyCustomName")
package interoperability
fun main() {

    val area = myJavaFile.getArea(6,7)
    println("Printing area of java method : $area")

}

fun add(a:Int,b:Int): Int {
    return a+b
}