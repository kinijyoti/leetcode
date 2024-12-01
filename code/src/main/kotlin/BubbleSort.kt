/*
Bubble sort is a sorting algorithm that repeatedly compares adjacent elements in a list and swaps them if they are in the wrong order.
The steps of bubble sort are:
1. Start at the beginning of the list
2. Compare the first value in the list with the next value
3. If the first value is larger, swap the positions of the two values
4. Move to the second value in the list
5. Repeat steps 2–4 until there are no more items to compare
6. Go back to the start of the list
 */

class BubbleSort {

    fun bubbleSort(array: IntArray) {
        val n = array.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (array[j] > array[j + 1]) {
                    val temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }
        }
    }
}