package collections


// mutable list -  Mutable No Fixed Size Can add remove
fun main(args: Array<String>) {

    var list1 = mutableListOf<Int>(5, 6, 8, 7) //  mutable. No Fixed Size. can add remove
    var list2 = arrayListOf<Int>(5, 6, 8, 7) //  mutable. No Fixed Size. can add remove
    var list = ArrayList<String>() //  mutable. No Fixed Size. can add remove

    list.add("Ayush")
    list.add("Golu")
    list.add("Akash")
    list.add("Steve")
    list.add("Uma")

//    list.remove("Golu")
//    list.add(1,"Axtentor")

/*  by this way you are accessing the element at specific index or updating the 
    element at specific index you are "not" adding the element at specific index
    if you try to add element at list[5]="axe" it will throw error 
   Index 5 out of bounds for length 4 */
    list[1] = "Ufc" 

    for (elements in list) {
        println(elements)
    }

    println()

    for (index in list.indices) {
        println(list[index])
    }

    println()

    list.forEach(::println)
    list1.forEach(::println)




}