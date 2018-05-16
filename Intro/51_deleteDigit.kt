fun deleteDigit(n: Int): Int {
    var currentMax = 0
    var nString = n.toString()
    
    for(i in nString.indices) {
        var tempNumber = nString.removeRange(i, i + 1).toInt()
        if(tempNumber > currentMax) {
            currentMax = newNumber
        }
    }
    
    return currentMax
}