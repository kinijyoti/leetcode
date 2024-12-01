/*
The selection sort algorithm is similar to how humans often sort things.
For example, if you're organizing a hand of cards, you can find the lowest
value card and put it in the left-most spot.
Then, find the lowest of the remaining cards
and place it to the right of the first card. Repeat until all the cards are in order.

The steps of the selection sort algorithm are:
1. Initialize: Set the first element as the current minimum.
2. Search: Find the smallest element in the unsorted section of the list.
3. Swap: Swap the smallest element with the first element in the unsorted section.
4. Repeat: Repeat steps 2–3 until the entire list is sorted.

Here's a more detailed explanation of the steps:
1. Initialize: Start by assuming the first element is the smallest.
2. Search: Compare each remaining unsorted element to the current minimum. If a smaller element is found, update the current minimum.
3. Swap: After finding the smallest element, swap it with the first unsorted element.
4. Repeat: Repeat steps 2–3 until the entire list is sorted.

 */

class SelectionSort {
    fun selectionSort(array: IntArray) {
        val n = array.size
        for (i in 0 until n - 1) {
            var minIndex = i
            for (j in i + 1 until n) {
                if (array[j] < array[minIndex]) {
                    minIndex = j
                }
            }
            val temp = array[i]
            array[i] = array[minIndex]
            array[minIndex] = temp
        }
    }
}