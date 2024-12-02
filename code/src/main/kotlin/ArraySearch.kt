class ArraySearch {

    fun findElement(array: Array<Int>, target: Int) {
        when (target) {
            in array -> println("$target is found in the array.")
            else -> println("$target is not found in the array.")
        }
    }

    fun findElementIndex(array: Array<Int>, target: Int): Int {
        return when (target) {
            in array -> array.indexOf(target) // Return index if the element is found
            else -> -1 // Return -1 if the element is not found
        }
    }

    fun findElementIndexForLoop(array: Array<Int>, target: Int): Int {
        for (index in array.indices) {
            if (array[index] == target) {
                return index // Return the index when the element is found
            }
        }
        return -1 // Return -1 if the element is not found
    }
}