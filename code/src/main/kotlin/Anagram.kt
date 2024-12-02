class Anagram {
    fun areAnagrams(str1: String, str2: String): Boolean {
        // Check if lengths are different, if yes, they can't be anagrams
        if (str1.length != str2.length) {
            return false
        }

        // Convert both strings to char arrays, sort them, and compare
        return str1.toCharArray().sorted() == str2.toCharArray().sorted()
    }

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val count = IntArray(26)
        for (i in s.indices) {
            count[s[i] - 'a']++
            count[t[i] - 'a']--
        }
        for (i in count.indices) {
            if (count[i] != 0) return false
        }
        return true
    }
}