package inline_more

fun main() {
    processRecords("AYush","Billy","Charlie","Trump")

    val k: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
}

fun processRecords(vararg records: String){
    for(record in records){
        executeAndMeasure(record) {
            save(record)

        }
    }
}

fun save(record: String){
    Thread.sleep(100)
}

inline fun executeAndMeasure(label: String, block:() -> Unit){
    val start = System.nanoTime()
    block()
    val end = System.nanoTime()
    println("Duration for $label: ${(end - start)/1_000_000} ms")
//    Cannot access private variable in inline function
//    iAmPrivate
}

private val iAmPrivate  = 5