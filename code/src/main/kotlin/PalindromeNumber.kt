class PalindromeNumber {
    fun isPalindrome(number: Int): Boolean {
        var isPalindromeNumber = false
        var sum = 0
        var tempNum = number

        while (tempNum > 0) {
            val r = tempNum % 10
            sum = sum * 10 + r
            tempNum /= 10
        }
        if (sum == number) {
            isPalindromeNumber = true
        }
        return isPalindromeNumber
    }
}