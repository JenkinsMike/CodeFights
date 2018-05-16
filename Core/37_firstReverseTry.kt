fun firstReverseTry(arr: MutableList<Int>): MutableList<Int> {
    if(!arr.isEmpty()) {
        var temp = arr.first()
        var size = arr.lastIndex
        arr[0] = arr.last()
        arr[size] = temp
    }
    
    return arr
}