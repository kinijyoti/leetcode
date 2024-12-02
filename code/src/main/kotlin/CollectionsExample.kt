class CollectionsExample {
    /*
 In Kotlin, the .associate function is used to
 create a map from a collection, where each element
  of the collection is transformed into a key-value pair.
   The function takes a lambda that returns a
   pair (key, value) for each element, and the result is a Map<K, V>.

  */
    fun associateExample() {
        val words = listOf("apple", "banana", "cherry")
        // Using associate to create a map where each word is associated with its index
        val wordToIndex = words.associate { it to it.length }
        //  val wordToIndex = words.associateWith { it.length }

        println(wordToIndex) // Output: {apple=5, banana=6, cherry=6}
    }

    /*
    In Kotlin, the .filter function is used to
    filter elements of a collection based on a given condition.
    It returns a new collection containing only the elements
     that satisfy the condition provided in the lambda expression.

Here are some examples to demonstrate how to use .filter:

     */
    fun filterExample() {
        val numbers = listOf(1, 2, 3, 4, 5, 6)

        // Filtering even numbers
        val evenNumbers = numbers.filter { it % 2 == 0 }
        println(evenNumbers) // Output: [2, 4, 6]

        val words = listOf("apple", "banana", "cat", "dog", "elephant")

        // Filtering words with length greater than 3
        val longWords = words.filter { it.length > 3 }
        println(longWords) // Output: [apple, banana, elephant]

        val people = listOf(
            Person("Alice", 30),
            Person("Bob", 25),
            Person("Charlie", 35),
            Person("Daisy", 28)
        )

        // Filtering people who are older than 28
        val olderThan28 = people.filter { it.age > 28 }
        println(olderThan28) // Output: [Person(name=Alice, age=30), Person(name=Charlie, age=35)]

    }

    /*
    In Kotlin, the .flatMap function is used to transform each element
     of a collection into a collection (like a list or set),
     and then it "flattens" the resulting collections into a single collection.
      It's particularly useful when each element in the original collection
      can produce multiple elements in the resulting collection.
     */
    fun flatMapExample() {
        val listOfLists = listOf(
            listOf(1, 2, 3),
            listOf(4, 5),
            listOf(6, 7, 8)
        )

        // Flattening the list of lists into a single list

//      val flattenedList = listOfLists.flatMap { it }
        val flattenedList = listOfLists.flatten()
        println(flattenedList) // Output: [1, 2, 3, 4, 5, 6, 7, 8]
    }

    /*
    In Kotlin, the .groupBy function is used to
    group elements of a collection based on a specified
     key selector function. It returns a Map<K, List<V>>,
     where each key corresponds to a group, and its associated
      value is a list of elements belonging to that group.
     */
    fun groupByExample() {
        val numbers = listOf(1, 2, 3, 4, 5, 6)
        // Grouping numbers into even and odd
        val grouped = numbers.groupBy { if (it % 2 == 0) "Even" else "Odd" }
        println(grouped)
        // Output: {Odd=[1, 3, 5], Even=[2, 4, 6]}

        val words = listOf("apple", "banana", "cherry", "avocado", "blueberry")
        // Grouping words by their first letter
        val groupedByFirstLetter = words.groupBy { it.first() }
        println(groupedByFirstLetter)
        // Output: {a=[apple, avocado], b=[banana, blueberry], c=[cherry]}

        val people = listOf(
            Person("Alice", 25),
            Person("Bob", 30),
            Person("Charlie", 25),
            Person("Daisy", 30)
        )
        // Grouping people by age
        val groupedByAge = people.groupBy { it.age }
        println(groupedByAge)
        // Output: {25=[Person(name=Alice, age=25), Person(name=Charlie, age=25)],
        //          30=[Person(name=Bob, age=30), Person(name=Daisy, age=30)]}


        val words1 = listOf("cat", "dog", "elephant", "ant", "bee", "lion")
        // Grouping words by their length
        val groupedByLength = words1.groupBy { it.length }
        println(groupedByLength)
        // Output: {3=[cat, dog, ant, bee], 8=[elephant], 4=[lion]}
    }

    /*
 In Kotlin, the .map function is used to transform each element
 in a collection into a new collection,
 where each element is transformed by a given function.
  */
    fun mapExample() {
        val people = listOf(
            Person("Alice", 30),
            Person("Bob", 25),
            Person("Charlie", 35)
        )

        // Create a list of names from the list of people
        val names = people.map { it.name }
        println(names) // Output: [Alice, Bob, Charlie]
    }

    /*
    n Kotlin, the .partition function is used to split a
    collection into two lists based on a given condition.
     It returns a Pair where:

The first list contains all elements that satisfy the condition (true condition).
The second list contains all elements that do not satisfy the condition (false condition).
     */
    fun partitionExample() {
        val numbers = listOf(1, 2, 3, 4, 5, 6)

        // Partitioning into even and odd numbers
        val (evenNumbers, oddNumbers) = numbers.partition { it % 2 == 0 }
        println("Even numbers: $evenNumbers") // Output: [2, 4, 6]
        println("Odd numbers: $oddNumbers")  // Output: [1, 3, 5]

        val words = listOf("apple", "bat", "banana", "cat", "dog")

        // Partitioning words based on length greater than 3
        val (longWords, shortWords) = words.partition { it.length > 3 }
        println("Long words: $longWords")   // Output: [apple, banana]
        println("Short words: $shortWords") // Output: [bat, cat, dog]

        val people = listOf(
            Person("Alice", 30),
            Person("Bob", 17),
            Person("Charlie", 25),
            Person("Daisy", 15)
        )

        // Partitioning adults and minors
        val (adults, minors) = people.partition { it.age >= 18 }
        println("Adults: $adults") // Output: [Person(name=Alice, age=30), Person(name=Charlie, age=25)]
        println("Minors: $minors") // Output: [Person(name=Bob, age=17), Person(name=Daisy, age=15)]

    }

    /*
    In Kotlin, the .reduce function is used to accumulate
     a collection into a single value by applying a binary
      operation to all elements in the collection.
      It combines elements of the collection step by step,
       using the result of one step as an input for the next step.
     */

    fun reduceExample() {
        val numbers = listOf(1, 2, 3, 4, 5)

        // Using reduce to sum all the numbers in the list
        val sum = numbers.reduce { acc, number -> acc + number }
        println(sum) // Output: 15

        val numbers1 = listOf(10, 20, 5, 40, 30)
        val maxNumber = numbers1.reduce { acc, number -> if (acc > number) acc else number }
        println(maxNumber) // Output: 40
    }

    /*
    In Kotlin, a Sequence is a type that is useful
     when working with large collections, as it processes
     elements lazily. This means that operations on a sequence
      are performed only when needed, which can improve performance
       when dealing with chains of transformations.

1. Lazy Evaluation: Sequences evaluate elements only when needed.
2. Efficient for Large Data: Avoids creating multiple intermediate collections.
3. Materialization: Use terminal operations (e.g., .toList()) to convert sequences back to collections.
Here’s an explanation of using .asSequence() in collections along with examples:
     */

    fun sequenceExample() {
        val numbers = listOf(1, 2, 3, 4, 5)
        // Convert the list to a sequence
        val sequence = numbers.asSequence()
        // Perform operations lazily
        val result = sequence.map { it * 2 }.filter { it > 5 }.toList()
        println(result) // Output: [6, 8, 10]
    }
    /*
    In Kotlin, the .sortedBy function is used to sort
     a collection based on the value of a property or
      a computed key. It creates a new list with the
      elements sorted in ascending order according to
      the given selector function.

Here are examples to demonstrate how .sortedBy works:
     */

    fun sortByExample() {
        val numbers = listOf(5, 2, 9, 1, 3)
        // Sorting numbers in ascending order
        val sortedNumbers = numbers.sortedBy { it }
        println(sortedNumbers) // Output: [1, 2, 3, 5, 9]

        val words = listOf("apple", "cat", "banana", "dog", "elephant")
        // Sorting words by their length
        val sortedByLength = words.sortedBy { it.length }
        println(sortedByLength) // Output: [cat, dog, apple, banana, elephant]

        val people = listOf(
            Person("Alice", 30),
            Person("Bob", 25),
            Person("Charlie", 35)
        )

        // Sorting people by age
        val sortedByAge = people.sortedBy { it.age }
        println(sortedByAge)
        // Output: [Person(name=Bob, age=25), Person(name=Alice, age=30), Person(name=Charlie, age=35)]

    }

    /*
    In Kotlin, the .zip function combines
    two collections into a single collection of pairs.
    The resulting list will have a size equal to the
    smaller of the two collections. This is useful when
     you want to combine or pair elements from two lists.

Here are some examples of how .zip can be used:
     */
    fun zipExample() {
        val names = listOf("Alice", "Bob", "Charlie")
        val ages = listOf(25, 30, 35)

        // Using zip to pair names with ages
        val pairedList = names.zip(ages)
        println(pairedList) // Output: [(Alice, 25), (Bob, 30), (Charlie, 35)]
/*---------------*/
        val numbers = listOf(1, 2, 3)
        val squares = listOf(1, 4, 9)

        // Using zip with a custom transformation
        val result = numbers.zip(squares) { number, square -> "$number squared is $square" }
        println(result) // Output: [1 squared is 1, 2 squared is 4, 3 squared is 9]

/*------- UNZIP------*/
        val pairedList1 = listOf("Alice" to 25, "Bob" to 30, "Charlie" to 35)

        // Using unzip to separate keys and values
        val (names1, ages1) = pairedList1.unzip()
        println(names1) // Output: [Alice, Bob, Charlie]
        println(ages1)  // Output: [25, 30, 35]
    }
}

data class Person(val name: String, val age: Int)


