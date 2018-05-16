fun removeArrayPart(inputArray: MutableList<Int>, l: Int, r: Int): MutableList<Int> {
    val shortArray = mutableListOf<Int>()
    
    for(i in inputArray.indices) {
        if((i < l) || (i > r)) {
            shortArray.add(inputArray[i])
        }
    }
    
    return shortArray
}