<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Destructuring Declarations in Kotlin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
        }
        h1 {
            color: #fff;
        }
        h2 {
            color: #fff;
        }
        pre {
            background-color: #000; /* Black background */
            border: 1px solid #ddd;
            padding: 10px;
            overflow-x: auto;
        }
        code {
            font-family: monospace;
            background-color: #000; /* Black background */
            color: #fff; /* White text */
            padding: 2px 4px;
            border-radius: 4px;
        }
    </style>
</head>
<body>

<h1>DESTRUCTURING DECLARATIONS IN KOTLIN</h1>
<p>Sometimes it’s easy to destructure an object into multiple variables of different properties instead of calling it again and again using the <code>.</code> operator on the property or instance itself. It is beneficial for a few reasons like:</p>
<ol>
    <li>We don’t have to use the dot property on the object again and again.</li>
    <li>If the object is of a nullable type, we can do the null check only once and then we can destructure it to non-nullable properties.</li>
    <li>The defined variable will be alive within the defined scope.</li>
    <li>Fewer chances of confusion and more readability.</li>
    <li>What is destructuring declaration?</li>
    <li>Let’s try to understand what is a destructuring declaration and how does it work internally.</li>
</ol>

<h2>How does it work internally?</h2>
<p>The compiler internally uses the <code>componentN</code> function of Kotlin to destructure the object and assign them to the properties individually.</p>
<p><code>componentN</code> is a functionality provided by Kotlin for any data class which returns the Nth property (in sequence from the beginning) of that data class.</p>

<h2>Use cases of destructuring declaration</h2>
<p>Destructuring declaration can be used anywhere but will try to list its common use cases where it can be way more useful and the readability would be better.</p>

<h3>1. Normal Flow</h3>
<p>Destructuring declaration can be used in any normal flow where an object’s properties need to be accessed multiple times.</p>
<pre><code>var employee = Employee(name = "Suneet", age = 29, department = "Engineering")

var (name, age, department) = employee
println("$name at the age of $age is working in $department department")</code></pre>

<h3>2. For-In loop</h3>
<p>Destructuring declaration can also be used with for-in loops. Instead of declaring the item while iteration, we can directly destructure them to variables and use them inside the loop.</p>
<pre><code>val list = listOf(Employee(name = "Suneet", age = 29, department = "Engineering"),
                  Employee(name = "John", age = 40, department = "Marketing"),
                  Employee(name = "Agrawal", age = 35, department = "Sales"))

for ((name, age, department) in list) {
println("$name at the age of $age is working in $department department")
}</code></pre>

<h3>3. Return from functions</h3>
<p>Destructuring declaration is also helpful while returning multiple values from a function. Instead of getting the result into a variable and then accessing its individual properties, we can directly destructure it to individual properties.</p>
<pre><code>fun getBestEmployee(): Employee {
    // do some calculations
    return Employee(name = "Suneet", age = 29, department = "Engineering")
}

val (name, age, department) = getBestEmployee()
println("The best Employee is $name")</code></pre>

<p>Keep in mind we can use <code>Pair</code> or <code>Triple</code> also but it’s better to have a named variable instead of <code>Pair</code> and <code>Triple</code> as that uses first, second and third as variable names.</p>

<h3>4. In Maps</h3>
<p>Destructuring declaration can further be used with maps where each entry can be destructured into a key and a value where both can be used directly.</p>
<pre><code>val map = mapOf(1 to "one", 2 to "two", 3 to "three")

for ((key, value) in map) {
println("$key is pointing to $value")
}</code></pre>

</body>
</html>
