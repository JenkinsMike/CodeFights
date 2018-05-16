fun alphabeticShift(inputString: String): String {
    var inputCharAr = inputString.toCharArray()
    
    for(i in inputCharAr.indices) {
        inputCharAr[i]++
        if(inputCharAr[i] == '{') {
            inputCharAr[i] = 'a'
        }
    }
    
    return inputCharAr.joinToString("")
}