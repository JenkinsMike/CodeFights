fun extractEachKth(inputArray: MutableList<Int>, k: Int): MutableList<Int> {
    var newArray = mutableListOf<Int>()
    
    for(i in inputArray.indices) {
        if(((i + 1) % k) != 0) {
            newArray.add(inputArray[i])
        }
    }
    
    return newArray
}