fun messageFromBinaryCode(code: String): String {
    var decryptedString: String = ""
    
    for(i in 0..(code.length - 8) step 8) {
        decryptedString = "$decryptedString${code.substring(i, (i + 8)).toByte(2).toChar().toString()}"
    }
    
    return decryptedString
}