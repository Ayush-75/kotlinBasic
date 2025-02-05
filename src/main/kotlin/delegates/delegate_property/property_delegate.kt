package delegates.delegate_property

fun main(args: Array<String>) {

    val my = My(10, ClassWithDelegate(20))
    topLevelInt = 30
    println(my.delegatedToMember) // Accesses memberInt via delegation
    println(my.delegatedToTopLevel) // Accesses topLevelInt via delegation
    println(my.delegatedToAnotherClass) // Accesses anotherClassInt via delegation
    println(my.extDelegated) // Accesses topLevelInt via extension property delegation

    /**
    * Here, oldName represents the old way (Alice) people used to contact for work.
New interactions are routed through newName, the updated contact.
Internally, oldName forwards all requests to newName. This ensures backward compatibility without duplicating logic.
*/
    my.oldName = 50 // Still works but shows a deprecation warning.
    println("here we have set value on oldName by its also assigned on newName ${my.newName}")

}

var topLevelInt: Int = 0

class ClassWithDelegate(val anotherClassInt: Int)

class My(var memberInt: Int, val anotherClassInstance: ClassWithDelegate) {
    var delegatedToMember: Int by this::memberInt // Delegates to memberInt
    var delegatedToTopLevel: Int by ::topLevelInt // Delegates to topLevelInt

    val delegatedToAnotherClass: Int by anotherClassInstance::anotherClassInt // Delegates to anotherClassInt of anotherClassInstance

    var newName: Int = 0

    @Deprecated("Use 'newName' instead", ReplaceWith("newName"))
    var oldName: Int by this::newName
}

var My.extDelegated: Int by ::topLevelInt // Extension property delegation to topLevelInt


/**
 * Analogy: A Messenger System
Imagine you have a person, say Alice, who is responsible for delivering messages.
 *  However, instead of directly handling the task herself,
 *  Alice assigns the responsibility of delivering the messages to her messenger assistant, Bob.
 *  Bob is now the one who does all the actual work, but Alice can still be approached as the contact person.

Now, let’s map this analogy to Kotlin's property delegation to another property:

Mapping the Analogy:
Alice (Original Property):
Alice represents the original property (e.g., delegatedToMember, delegatedToTopLevel).

Bob (Delegate Property):
Bob represents the delegate property (e.g., memberInt, topLevelInt) that actually performs
the work of storing and retrieving the values. Alice is the face the world interacts with,
but it's Bob who knows how to do the job.

Delegation Relationship:
In Kotlin, Alice (a property) delegates her responsibility to Bob (another property)
using the :: syntax. This conveys that whenever you interact with Alice to set or get a value,
she's merely forwarding the work to Bob.

Communication Path:
When you get or set values through Alice, Bob is the one actually handling them behind the scenes.
 * */