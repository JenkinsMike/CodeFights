fun reverseParentheses(s: String): String {
    var openParenIndex: Int
    var closeParenIndex: Int
    var reversedString: String
    var stringToManipulate: String = s
    
    while(stringToManipulate.contains("(") || stringToManipulate.contains(")")) {
        closeParenIndex = stringToManipulate.indexOf(")")
        openParenIndex = closeParenIndex - 1
        while(!stringToManipulate.elementAt(openParenIndex).equals('(')) {
            openParenIndex--
        }
        
        reversedString = stringToManipulate.substring(openParenIndex + 1..closeParenIndex - 1).reversed()
        stringToManipulate = stringToManipulate.replaceRange(openParenIndex + 1, closeParenIndex, reversedString).removeRange(openParenIndex, openParenIndex + 1).removeRange(closeParenIndex - 1, closeParenIndex)
    }
    
    return stringToManipulate
}