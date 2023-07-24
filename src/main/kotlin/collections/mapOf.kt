package collections



// Map tutorial : key and value pair
fun main(args: Array<String>) {

    // Map: mapof :immutable read only and fixed size

    var myMap = mapOf<Int,String>(4 to "yogi",43 to "Manmohan",7 to "vajpayee")

    for (keys in myMap.keys){
        println("Elements at key: $keys = ${myMap[keys]}")  // myMap.get(key)
    }

}