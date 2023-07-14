package enums

interface CardCashBack{
    fun getCashbackValue():Float
}

enum class CreditCardType(var color:String,var maxlimit:Int = 10000000):CardCashBack {
    SILVER("Gray",50000) { //ordinal = 0  name = SILVER
        override fun getCashbackValue(): Float = 0.02f
    },
    GOLD("Gold") { //1
        override fun getCashbackValue(): Float = 0.04f
    },
    PLATINUM("Black") { //2
        override fun getCashbackValue(): Float = 0.06f
    }
}

fun main() {

    /* Access properties and methods */
    println(CreditCardType.SILVER.color)    // gray
    println(CreditCardType.SILVER.getCashbackValue())   // 0.02

    /* Enum constants are objects of enum class type. */
    val peterCardType: CreditCardType = CreditCardType.GOLD

    /* Each enum object has two properties: ordinal and name */
    println(CreditCardType.GOLD.ordinal)
    println(CreditCardType.GOLD)    // OR CreditCardType.GOLD.name

    /* Each enum object has two methods: values() and valueOf() */
    val myConstants: Array<CreditCardType> = CreditCardType.values()
    myConstants.forEach { println(it) }
    val myFind = CreditCardType.valueOf("GOLD")
    println(myFind)

    /* Using in 'when' statement */
    when(peterCardType) {
        CreditCardType.SILVER -> println("Peter has silver card")
        CreditCardType.GOLD -> println("Peter has gold card")
        CreditCardType.PLATINUM -> println("Peter has platinum card")
    }
}