fun isSumOfConsecutive2(n: Int): Int {
    var result = 0
    var minuend: Int
    var subtrahend: Int
    
    for(i in 1 until n) {
        minuend = n
        subtrahend = i
        while(minuend > 0) {
            minuend = minuend - subtrahend
            subtrahend++
        }
        
        if(minuend == 0) {
            result++
        }
    }
    
    return result
}