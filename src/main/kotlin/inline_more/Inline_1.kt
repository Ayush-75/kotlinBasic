package inline_more

fun main() {

}

fun processRecords(vararg records: String){
    for(record in records){
        executeAndMeasure(record) {
            save(record)
        }
    }
}

fun save(record: String){
//    record.add
}

inline fun executeAndMeasure(label: String, block:() -> Unit){
    val start = System.nanoTime()
    block()
    val end = System.nanoTime()
    println("Duration for $label: ${(end - start)/1_000_000} ms")
}