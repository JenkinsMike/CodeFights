fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {
    var maxDiff = 0
    var tempDiff = 0
    for(i in 0..inputArray.size - 2) {
        tempDiff = (maxOf(inputArray[i], inputArray[i + 1])) - (minOf(inputArray[i], inputArray[i + 1]))
        
        if(tempDiff > maxDiff) {
            maxDiff = tempDiff
        }
    }
    
    return maxDiff
}