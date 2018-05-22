fun alphabetSubsequence(s: String): Boolean {
    for(i in 0 until (s.length - 1)) {
        if(s[i] >= s[i + 1]) {
            return false
        }
    }
    
    return true
}