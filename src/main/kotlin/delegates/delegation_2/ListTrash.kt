package delegates.delegation_2

/**
 * thus inheriting all methods behavior of a standard MutableList.
 * By using the `by` keyword, we removed most of the boilerplate code, making the code concise and small.
 * If we don't use the `by` keyword, we would need to manually implement all the methods of the MutableCollection interface.
```*/
fun main() {

    val listWithTrash = ListWithTrash<String>()

    listWithTrash.add("Book 1")
    listWithTrash.add("Book 2")
    listWithTrash.add("Book 3")

    println("List before removal : $listWithTrash")

    listWithTrash.remove("Book 2")
    println("List after removal : $listWithTrash")

    val recoveredItem = listWithTrash.recover()
    println("Recovered Item $recoveredItem")
}

class ListWithTrash<T>(
    private val innerList: MutableList<T> = ArrayList<T>()
) : MutableCollection<T> by innerList {

    var deletedItem: T? = null

    override fun remove(element: T): Boolean {
        deletedItem = element
        return innerList.remove(element)
    }

    fun recover(): T? {
        return deletedItem
    }

    override fun toString(): String {
        return innerList.toString()
    }
}

/**
 * Delegation: ListWithTrash delegates MutableCollection methods to innerList,
 * thus inheriting all methods behavior of a standard MutableList.
 * Custom Behavior: The remove method is customized to remember the last deleted item,
 * and recover method provides a way to retrieve this item.
 * */

/**
 * Definition: Delegation involves one object relying on another object to provide
specific functionality, rather than inheriting it.
 * Relationship: Represents a "has-a" relationship. For example,
a Car has a Engine.
 *Loose Coupling: Delegation encourages loose coupling between components,
making the overall system more flexible and easier to modify.
 *Code Reuse: The delegating class reuses the methods of the delegate
class by calling its methods internally.*/