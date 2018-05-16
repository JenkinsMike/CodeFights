fun isSubstitutionCipher(string1: String, string2: String): Boolean {
    val pairedIntVal: MutableList<Int> = MutableList(26) { -1 }
    val pairedBool: MutableList<Boolean> = BooleanArray(26).toMutableList()
    
    for(i in 0 until string1.length) {
        val ch1 = string1[i] - 'a'
        val ch2 = string2[i] - 'a'
        if(pairedIntVal[ch1] != ch2 && (pairedBool[ch2] || pairedIntVal[ch1] != -1)) {
            return false
        }
        
        pairedIntVal[ch1] = ch2
        pairedBool[ch2] = true
    }
    
    return true
}