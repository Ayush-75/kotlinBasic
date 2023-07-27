package properties

fun main() {

    var human = Human()
    human.age = 24
    println(human.age)
}

class Human{
    private var _age:Int = 0 // backing field:hold actual property data
    var age:Int   //backing property exposed to outside world
        get() {
            return _age
        }
        set(value) {
            _age = value
        }
    /**
     * Within class human always use _age field to access the
     * property , but outside class human,use age to access the property
     */
}