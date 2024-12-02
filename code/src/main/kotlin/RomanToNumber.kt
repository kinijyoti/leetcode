class RomanToNumber {
    fun romanToInt(s: String): Int {
        val hm = HashMap<Char, Int>()
        hm['I'] = 1
        hm['V'] = 5
        hm['X'] = 10
        hm['L'] = 50
        hm['C'] = 100
        hm['D'] = 500
        hm['M'] = 1000
        var result = hm[s[s.length - 1]]!!
        for (i in s.length - 2 downTo 0) {
            result = if (hm[s[i]]!! < hm[s[i + 1]]!!) {
                result - hm[s[i]]!!
            } else {
                result + hm[s[i]]!!
            }
        }
        return result
    }
}