package collections



// Map tutorial : key and value pair
fun main(args: Array<String>) {

    // Map: mapof :immutable read only and fixed size

    var myMap = mapOf<Int,String>(4 to "yogi",43 to "Manmohan",7 to "vajpayee")

    for (keys in myMap.keys){
        println("Elements at key: $keys = ${myMap[keys]}")  // myMap.get(key)
    }

     for ((key,value) in myMap){
        println("key for $value : $key")
    }

    /**
    _> ignore <_
     * Keep in mind that this approach works fine for small maps,
     * but if you have a large map, doing this operation repeatedly may not be efficient.
     * In such cases, you might consider creating a reverse map where values become keys
     * and keys become values for faster lookup.
     */
    // for (value in myMap.values){
    //    val key = myMap.entries.first{ it.value == value }?.key
    //     println("key for value $value : $key")
    }

}