package type_check_casting

interface Status{
    fun signal()
}

interface Ok:Status
interface Postpone:Status
interface Declined:Status

fun signalCheck(signalStatus:Any){
    if (signalStatus is Postpone || signalStatus is Declined){
//        signalStatus.signal()
    }
}