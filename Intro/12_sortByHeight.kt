fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
    var noTreeArray = a.filterNot { it == -1 }.sorted()
    var noTreeIndex = 0
    
    for(i in a.indices) {
        if(a[i] != -1 && noTreeIndex <= noTreeArray.size) {
            a[i] = noTreeArray[noTreeIndex]
            noTreeIndex++
        }
    }
    
    return a
}