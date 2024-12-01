/*
The steps for insertion sort are:
1.Start with an unsorted list
2.Take the first element from the unsorted part of the list and consider it sorted
3.Compare the next element to the sorted elements
4.If the new element is smaller than any of the sorted elements,
  move them to the right to make room
5.Insert the new element into its correct position
6Repeat until all elements are sorted
 */

class InsertionSort {
    fun insertionSort(array: IntArray) {
        val n = array.size
        for (i in 1 until n) {
            val key = array[i]
            var j = i - 1
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]
                j--
            }
            array[j + 1] = key
        }
    }
}