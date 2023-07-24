package collections

fun main(args: Array<String>) {

    // Hashmap,hashMapOf,mutableMapOf: mutable read and write both and Not fixed size

    var myMap = HashMap<Int, String>()
    var myMap1 = hashMapOf<Int,String>(10 to "Axtentor")
    var myMap2 = mutableMapOf<Int,String>() // return LinkedList

    myMap.put(24,"Ayush")
    myMap.put(5,"Ufc")
    myMap.put(29,"yogi")
    myMap[7] = "manmohan"

    /**
     * The put() and putAll() function is used to add elements in the MutableMap.put()
     * function adds single element at time while putAll()
     * function can be used to add multiple element at a time in MutableMap.
    * */

    myMap.putAll(myMap1)

    myMap.replace(7,"Modi")  // or myMap.put(7, "Modi")

    for (keys in myMap.keys) {
        println("Elements at key: $keys = ${myMap[keys]}")  // myMap.get(key)
    }

    myMap.forEach(::println)



}