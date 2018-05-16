fun isIPv4Address(inputString: String): Boolean {
    var splitInput = inputString.split(".")
    
    if(splitInput.size != 4) {
        return false
    }
    
    for(i in splitInput) {
        try {
            if(i.toInt() > 255) {
                return false
            }
        }
        catch(e: Exception) {
            return false
        }
    }
    
    return true
}