package generics.generics_1

class Box<out T>(var value: @UnsafeVariance T){
    fun getValueOf():T = value
     fun setValueOf(value: @UnsafeVariance T) {
        this.value  = value
    }
}