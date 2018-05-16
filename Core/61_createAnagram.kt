fun createAnagram(s: String, t: String): Int {
    var s1IntVal: MutableList<Int> = MutableList(26) { 0 }
    var s2IntVal: MutableList<Int> = MutableList(26) { 0 }
    var result = 0
    
    for(i in s.indices) {
        s1IntVal[s[i] - 'A']++
        s2IntVal[t[i] - 'A']++
    }
    
    for(i in 0 until 26) {
        result += Math.abs(s1IntVal[i] - s2IntVal[i])
    }
    
    return result / 2
}