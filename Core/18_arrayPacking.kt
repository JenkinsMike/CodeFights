fun arrayPacking(a: MutableList<Int>): Int {
    var result: Int = 0
    
    for(i in a.reversed()) {
        result = result.shl(8).or(i)
    }
    
    return (result)
}