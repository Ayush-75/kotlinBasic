package scope_function

//Also
fun main(args: Array<String>) {


    /** Scope Function:
     *  'also''ALSO PERFORM THE FOLLOWING EXTRA OPERATION'
    Property 1: Refer to context object by using 'it'
    Property 2: The return value is the 'context object'  */

    var numberList:MutableList<Int> = mutableListOf(1,2,3)

    val duplicateList = numberList.also {
        println("the list element are:$it")

        it.add(4)
        println("list after adding element $it")

        it.remove(2)
        println("list after removing $it")
    }

    //both variables are pointing at the same object
    println("Original list : $numberList ")
    println("duplicate list : $duplicateList ")


}