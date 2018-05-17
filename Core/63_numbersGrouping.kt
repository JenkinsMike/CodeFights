fun numbersGrouping(a: MutableList<Int>): Int {
    var numGroup: MutableList<Int> = MutableList(100000) { 0 }
    //var numGroup: MutableList<Int> = MutableList(100_000) { 0 } //Also works
    var ndx = 0
    
    for(i in 0 until a.size) {
        ndx = (a[i] - 1) / 10000
        //ndx = (a[i] - 1) / 10_000 //Also works
        if(numGroup[ndx] == 0) {
            numGroup[ndx] += 2
        }
        else {
            numGroup[ndx]++
        }
    }
    
    return numGroup.toTypedArray().sum()
}