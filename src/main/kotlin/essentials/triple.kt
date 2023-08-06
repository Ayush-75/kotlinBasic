package essentials

fun main(args: Array<String>) {

    var book = Book("'You cant hurt me'","David Googins",2023)

    val titleAuthor = book.getAuthorAndTitle()
    val titleAuthorAndYear = book.getTitleAuthorAndYear()

    // properties
    println("Here is a book ${titleAuthor.first} written by ${titleAuthor.second} in ${titleAuthorAndYear.third}")


    // extension function
    println(titleAuthorAndYear.toList())
    // function
    titleAuthorAndYear.toString()


}

fun Book.getAuthorAndTitle():Pair<String,String>{
    return title to author
}
class Book(val title:String,val author:String,val year:Int ){

    fun getTitleAuthorAndYear():Triple<String,String,Int>{
        return Triple(title,author,year)
    }
}