class InfinteArraySearch {
    fun searchInfiniteArray(arr: IntArray, target: Int): Int {
        var low = 0
        var high = 1

        while (arr[high] < target) {
            low = high
            high *= 2
        }

        return binarySearch(arr, target, low, high)
    }

    fun binarySearch(arr: IntArray, target: Int, low: Int, high: Int): Int {
        var left = low
        var right = high

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (arr[mid] == target) {
                return mid
            } else if (arr[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return -1
    }
}