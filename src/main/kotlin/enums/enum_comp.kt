package enums

// A property with default value provided
enum class DAYS(val isWeekend: Boolean = false){
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    // Default value overridden
    SATURDAY(true);

    companion object{
        fun today(obj: DAYS): Boolean {
            return obj.name.compareTo("SATURDAY") == 0  || obj.name.compareTo("SUNDAY") == 0
        }
    }
}

fun main(){
    // A simple demonstration of properties and methods
    for(day in DAYS.values()) {
        println("${day.ordinal} = ${day.name} and is weekend ${day.isWeekend}")
    }
    val today = DAYS.SUNDAY
    println("Is today a weekend ${DAYS.today(today)}")

    val dad:Boolean = DAYS.today(DAYS.SUNDAY)
    println(dad)
}
