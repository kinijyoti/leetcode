class ArraySearch {

    val nums = intArrayOf(1,2,3,4,5,6,7,8,45,75,345,57,37,43)
    fun findElement(array: IntArray, target: Int) {
        when (target) {
            in array -> println("$target is found in the array.")
            else -> println("$target is not found in the array.")
        }
    }

    fun findElementIndex(array: IntArray, target: Int): Int {
        return when (target) {
            in array -> array.indexOf(target) // Return index if the element is found
            else -> -1 // Return -1 if the element is not found
        }
    }

    fun findElementIndexForLoop(array: IntArray, target: Int): Int {
        for (index in array.indices) {
            if (array[index] == target) {
                return index // Return the index when the element is found
            }
        }
        return -1 // Return -1 if the element is not found
    }

    fun findElementInSortedArray(array: IntArray, target: Int): Int {
        var left = 0
        var right = array.size - 1

        while (left <= right) {
            val mid = left + (right - left) / 2 // Avoid overflow for large indices

            when {
                array[mid] == target -> return mid // Element found
                array[mid] < target -> left = mid + 1 // Search in the right half
                else -> right = mid - 1 // Search in the left half
            }
        }
        return -1 // Element not found
    }
}