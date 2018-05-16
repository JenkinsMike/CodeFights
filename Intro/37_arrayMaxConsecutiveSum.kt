fun arrayMaxConsecutiveSum(inputArray: MutableList<Int>, k: Int): Int {
    var maxValue = 0
    
    for(i in 0..(inputArray.size - k)) {
        var total = sumPlusNextKth(inputArray, i, k)
        maxValue = Math.max(maxValue, total)
    }
    
    return maxValue
}

fun sumPlusNextKth(inputArray: MutableList<Int>, startIndex: Int, k: Int): Int {
    var total = 0
    
    for(j in startIndex until (startIndex + k)) {
        total += inputArray[j]
    }
    
    return total
}