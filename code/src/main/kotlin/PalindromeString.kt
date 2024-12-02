class PalindromeString {
    fun isPalindrome(s: String): Boolean {
        var onlyChar = ""
        for(c in s) {
            if(c.isLetter()) {
                onlyChar += c
            }
        }

        var start = 0
        var end = onlyChar.length - 1
        while (end >= start) {

            if(onlyChar[start].lowercase() != onlyChar[end].lowercase())
                return false else {
                start ++
                end --
            }
        }
        return true
    }
}