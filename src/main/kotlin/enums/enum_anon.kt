package enums

fun main(args: Array<String>) {

    Season.Summer.info()
}

enum class Season(var weather: String) {
    Summer("Hot") {
        override fun info() {
            println("Hot days of year")
        }
    },
    Winter("Cold") {
        override fun info() {
            println("Cold days of year")
        }
    },
    Rainy("Rain") {
        override fun info() {
            println("Rainy day of year")
        }
    };

    abstract fun info()
}