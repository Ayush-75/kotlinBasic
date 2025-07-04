fun main() {
    val r1 = (1..10).filter { it % 2 == 0 }.map { it*2 }
    val r2 = 5 downTo 1

    var j = 0
    while (j< r1.size){
        println(r1[j])
        j++
    }

    print("========================================\n")

   for (i in r1){
       println(i)
   }

    print("========================================\n")

    for(k in r1.indices){
        println(r1[k])
    }
    print("========================================\n")

    for((index, value) in r1.withIndex()){
        println("Element at index $index : $value")
    }
}
