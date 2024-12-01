class MergeSortedArray {
    // We have two sorted arrays:
    // nums1 = [1,2,3,0,0,0], m = 3 (the first m elements are the actual values)
    // nums2 = [2,5,6], n = 3 (n elements are actual values)
    // The goal is to merge nums2 into nums1 and sort in-place without extra sorting steps.

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        // Initialize pointers for the last elements of nums1 and nums2
        var i = m-1 // Pointer for the last valid element in nums1 (ignores trailing zeros)
        var j = n-1 // Pointer for the last element in nums2
        var k = m+n-1 // Pointer for the last position in nums1 (end of the array)

        // Merge nums1 and nums2 from the end to the beginning to avoid overwriting elements in nums1
        while(j>=0) {// Continue until one of the arrays is exhausted

            if(i>=0 && (nums1[i] > nums2[j])){ // If the current element in nums1 is larger, place it at the end of nums1
                nums1[k] = nums1[i] // Place nums1[i] at index k
                i--
                k--
            } else { // If the current element in nums2 is larger or equal, place it at the end of nums1
                nums1[k] = nums2[j] // Place nums2[j] at index k
                j--
                k--
            }
        }
    }
}