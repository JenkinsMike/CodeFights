fun absoluteValuesSumMinimization(a: MutableList<Int>): Int {
    var aLength = a.size
    
    if(aLength % 2 == 0) {
        return a[aLength / 2 - 1]
    }
    else {
        return a[aLength / 2]
    }
}