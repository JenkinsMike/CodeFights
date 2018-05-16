fun stringsRearrangement(inputArray: MutableList<String>): Boolean {
    var str: String? = inputArray.minBy { s -> inputArray.filter { it.letterCheck(s) }.size }
    
    if(str == null) {
        return false
    }
    
    return rearrange(inputArray, str!!)
}

fun String.letterCheck(str: String): Boolean {
    var noError = true
    
    for(i in this.indices) {
        if(str[i] != this[i]) {
            if(noError) {
                noError = false
            }
            else {
                return false
            }
        }
    }
    
    return !noError
}

fun rearrange(strArray: List<String>, str: String): Boolean {
    val newStrArray: List<String> = strArray - str
    
    if(strArray.size == 1) {
        return true
    }
    
    for(next in strArray.filter { it.letterCheck(str) }) {
        if(rearrange(newStrArray, next)) {
            return true
        }
    }
    
    return false
}
