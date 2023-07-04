package iterators

fun main(args: Array<String>) {
    // outer for loop
    for (i in 1..3) {
        // inner for loop
        for (j in 1..3) {
            if (i == 2 && j == 2){
                // It will continue from inner for loop
                // means it will skip this if() condition
                continue
            }
            println("$i $j")
        }
    }

    println("-------------------------------------")

    // outer for loop
    myContinue@for (i in 1..3) {
        // inner for loop
        for (j in 1..3) {
            if (i == 2 && j == 1){
               /* It will continue from outer for loop
                 it will jump to outer loop and start next condition
                by default it applicable for nearest forLoop withIn it present
                So we use labeled forLoop So it can Continue on which we
                assigned labeled forLoop

                */
                continue@myContinue
            }
            println("$i $j")
        }
    }


}