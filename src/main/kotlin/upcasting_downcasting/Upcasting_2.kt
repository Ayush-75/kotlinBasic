package upcasting_downcasting
sealed interface SyntaxHighlighter {
    fun highlight(text: String): String
}

class PythonSyntaxHighlighter : SyntaxHighlighter {
    override fun highlight(text: String): String {
        // Implement the logic to highlight Python syntax
        return "Python syntax highlighted: $text"
    }
}

class JavaSyntaxHighlighter : SyntaxHighlighter {
    override fun highlight(text: String): String {
        // Implement the logic to highlight Java syntax
        return "Java syntax highlighted: $text"
    }
}

class HtmlSyntaxHighlighter : SyntaxHighlighter {
    override fun highlight(text: String): String {
        // Implement the logic to highlight HTML syntax
        return "HTML syntax highlighted: $text"
    }
}

fun applySyntaxHighlighting(highlighter: SyntaxHighlighter, text: String): String {
    return highlighter.highlight(text)
}

fun main() {
    val pythonText = "def say_hello(): print('Hello World')"
    val javaText = "public class HelloWorld { public static void main(String[] args) { System.out.println('Hello World'); } }"
    val htmlText = "<html><body>Hello World</body></html>"

    val pythonHighlighter = PythonSyntaxHighlighter()
    val javaHighlighter = JavaSyntaxHighlighter()
    val htmlHighlighter = HtmlSyntaxHighlighter()

    // Using polymorphism to apply the correct syntax highlighting for each language
    println(applySyntaxHighlighting(pythonHighlighter, pythonText))  // Python syntax highlighted: ...
    println(applySyntaxHighlighting(javaHighlighter, javaText))      // Java syntax highlighted: ...
    println(applySyntaxHighlighting(htmlHighlighter, htmlText))      // HTML syntax highlighted: ...
}
