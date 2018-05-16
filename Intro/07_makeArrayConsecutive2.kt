fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    var sortedAr = statues.toTypedArray().sortedArray()
    val firstNumber = sortedAr.first()
    val lastNumber = sortedAr.last()
    val spreadNumber = lastNumber - firstNumber
    
    return (spreadNumber - sortedAr.size + 1)
}