fun lineEncoding(s: String): String {
    var sArray = s.toMutableList()
    var savedChar = sArray[0]
    var counter = 0
    var returnString: String = ""
    
    for(i in sArray.indices) {
        if(sArray[i] == savedChar) {
            counter++
        }
        else {
            if(counter != 1) {
                returnString = returnString + counter + savedChar
            }
            else {
                returnString = returnString + savedChar
            }
            
            counter = 1
            savedChar = sArray[i]
        }
    }
    
    if(counter != 1) {
        returnString = returnString + counter + savedChar
    }
    else {
        returnString = returnString + savedChar
    }
    
    return returnString
}