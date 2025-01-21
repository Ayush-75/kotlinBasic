package generics.generics_4


class Library<T>(private val books: List<T>) {
    fun getBook(index: Int): T = books[index]
    fun addBook(book: T) {
        // Normally you'd add the book to the list here
        println("Added book: $book")
    }
}
open class Book(val title: String)
class Fiction(title: String) : Book(title)
class NonFiction(title: String) : Book(title)

fun displayBooks(library: Library<*>) {
    // Since the type parameter is not known, we can't add books
    // We can only safely call functions that don't depend on the type parameter

    for (i in 0 until 3) { // assuming at least 3 books for simplicity
        println(library.getBook(i))
    }
}

fun main() {
    val fictionLibrary = Library(listOf(Fiction("Fiction Book 1"), Fiction("Fiction Book 2"), Fiction("Fiction Book 3")))
    val nonFictionLibrary = Library(listOf(NonFiction("NonFiction Book 1"), NonFiction("NonFiction Book 2"), NonFiction("NonFiction Book 3")))

    displayBooks(fictionLibrary)
    displayBooks(nonFictionLibrary)
}
