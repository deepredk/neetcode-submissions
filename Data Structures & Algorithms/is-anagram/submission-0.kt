class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sArr = IntArray('z'-'a'+1)
        val tArr = IntArray('z'-'a'+1)

        for (sCh in s) {
            sArr[sCh-'a']++
        }
        for (tCh in t) {
            tArr[tCh-'a']++
        }

        for (i in 0 until 'z'-'a') {
            if (sArr[i] != tArr[i]) {
                return false
            }
        }
        return true
    }
}
