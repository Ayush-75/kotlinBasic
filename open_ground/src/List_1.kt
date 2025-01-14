fun main(args: Array<String>) {

    fun main(args: Array<String>) {
        // Generate a sequence starting from 1, incrementing each subsequent value by 1
        val list = generateSequence(1) { it + 1 }
            // Take the first 10 elements of the sequence
            .take(10)
            // Collect these elements into an ArrayList
            .toCollection(ArrayList())

        // Print each element in the list
        list.forEach(::println)
    }
}