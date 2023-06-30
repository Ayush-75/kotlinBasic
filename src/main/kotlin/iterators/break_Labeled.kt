package iterators

fun main(args: Array<String>) {

    // outer for loop
     for (i in 1..3) {
        // inner for loop
        for (j in 1..3) {
            println("$i $j")
            if (i == 2 && j == 2){
                // It will break from inner for loop
                break
            }
        }
    }

    println("----------------------------------------")
    // Labeled break

    // outer for loop
    myBreak@ for (i in 1..3){
        // inner for loop
        for (j in 1..3){
            println(" labeled break $i $j")
            if (i==2 && j == 2){
                // It will break from outer loop not from inner for loop
                break@myBreak
            }
        }
    }
}