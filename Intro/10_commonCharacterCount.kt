fun commonCharacterCount(s1: String, s2: String): Int {
    var counter = 0
    var str1 = StringBuffer(s1)
    var str2 = StringBuffer(s2)
    
    for(i in 0..str1.length - 1) for(j in 0..str2.length - 1) {
        if(str1[i] == str2[j]) {
            str2.deleteCharAt(j)
            counter++
            break
        }
    }
    
    return counter
}