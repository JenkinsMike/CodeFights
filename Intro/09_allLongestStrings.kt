fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    var currentMaxStringLength = 0
    var counter = 0
    
    for(i in inputArray.indices) {
        if(currentMaxStringLength < inputArray[i].length) {
            currentMaxStringLength = inputArray[i].length
            counter = 1
        }
        else if(currentMaxStringLength == inputArray[i].length) {
            counter++
        }
        else {
            continue
        }
    }
    
    val longestArray: MutableList<String> = MutableList(counter) { "$it" }

    counter = 0
    
    for(i in inputArray.indices) {
        if(inputArray[i].length == currentMaxStringLength) {
            longestArray[counter] = inputArray[i]
            counter++
        }
    }
    
    return longestArray
}