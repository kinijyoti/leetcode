class ForLoop {

    fun forLoop() {
        val numbers = arrayOf(10, 20, 30, 40, 50)

        // Simple iteration
        for (number in numbers) {
            println(number)
        }

        // using indices
        for (index in numbers.indices) {
            println("Index: $index, Value: ${numbers[index]}")
        }

        // Inclusive range
        for (i in 1..5) {
            println(i)
        }

        // Iterating with a step of 2
        for (i in 1..10 step 2) {
            println(i)
        }

        // Iterating in Reverse
        for (i in 10 downTo 1) {
            println(i)
        }

        //lambda
        numbers.forEach { number ->
            println(number)
        }

        //nested for loop
        for (i in 1..3) {
            for (j in 1..3) {
                println("i: $i, j: $j")
            }
        }

        // Using for with a Map
        val map = mapOf("A" to 1, "B" to 2, "C" to 3)

        for ((key, value) in map) {
            println("Key: $key, Value: $value")
        }
    }
}