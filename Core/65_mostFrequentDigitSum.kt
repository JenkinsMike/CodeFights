fun mostFrequentDigitSum(n: Int): Int {
    var digitList: MutableList<Int> = mutableListOf()
    var deltaList: MutableList<Int> = mutableListOf()
    var nNew = n
    
    digitList.add(nNew)
    while(nNew > 0) {
        digitList.add(nNew - addDigits(nNew))
        deltaList.add(addDigits(nNew))
        nNew -= addDigits(nNew)
    }
    
    return mostFreq(deltaList)
}

fun addDigits(n: Int) = n.toString().map { it.toString().toInt() }.sum()

fun mostFreq(dList: MutableList<Int>): Int {
    var mostMatches = 0
    var mostHolder = 0
    var matches = 0
    var holder: Int
    
    dList.sort()
    for(i in dList.indices) {
        matches = 0
        holder = dList[i]
        
        for(number in dList) {
            if(number == holder) {
                matches++
            }
        }
        
        if(matches > mostMatches) {
            mostMatches = matches
            mostHolder = holder
        }
    }
    
    if(matches == mostMatches) {
        mostHolder = dList.last()
    }
    
    return mostHolder
}