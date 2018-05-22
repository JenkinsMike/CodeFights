fun houseNumbersSum(inputArray: MutableList<Int>): Int {
    var beforeZero: MutableList<Int> = mutableListOf<Int>()
    
    for(i in inputArray.indices) {
        if(inputArray[i] == 0) {
            break
        }
        
        beforeZero.add(inputArray[i])
    }
    
    return beforeZero.toTypedArray().sum()
}