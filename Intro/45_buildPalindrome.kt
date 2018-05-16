fun buildPalindrome(st: String): String {
    var reversedString = st.reversed()
    
    if(!checkPalindrome(st)) {
        for(i in 0..st.length) {
            if(checkPalindrome(st + reversedString.substring(reversedString.length - 1 - i))) {
                return st + reversedString.substring(reversedString.length - 1 - i)
            }
        }
    }
    
    return st
}

fun checkPalindrome(st: String): Boolean {
    for(i in 0..st.length / 2) {
        if(st[i] != st[st.length - 1 - i]) {
            return false
        }
    }
    
    return true
}