class Isomorphic {
    fun isIsomorphic(str1: String, str2: String): Boolean {
        if (str1.length != str2.length) return false

        val charMap = HashMap<Char, Char>()
        val mappedChars = HashSet<Char>()

        for (i in str1.indices) {
            val char1 = str1[i]
            val char2 = str2[i]

            if (charMap.containsKey(char1)) {
                // Check if the mapping is consistent
                if (charMap[char1] != char2) return false
            } else {
                // Check if char2 is already mapped to another character
                if (mappedChars.contains(char2)) return false

                // Create a new mapping
                charMap[char1] = char2
                mappedChars.add(char2)
            }
        }
        return true
    }
}