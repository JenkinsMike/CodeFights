fun palindromeRearranging(inputString: String): Boolean {
    var count = 0
    val groups = inputString.toCharArray().groupBy { it }
    
    for(i in groups) {
        if(i.value.size % 2 != 0) {
            count += 1
        }
    }
    
    return count < 2
}