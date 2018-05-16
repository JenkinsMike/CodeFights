fun comfortableNumbers(l: Int, r: Int): Int {
    var validPairs = 0
    
    for(i in l..r) {
        for(j in (i + 1)..r) {
            var sumCountI = sumUp(i)
            var sumCountJ = sumUp(j)
            if((j >= (i - sumCountI)) && (j <= (i + sumCountI)) && (i >= (j - sumCountJ)) && (i <= (j + sumCountJ))) {
                validPairs++
            }
        }
    }
    
    return validPairs
}

fun sumUp(n: Int): Int {
    var sum = 0
    var iteratorN = n
    
    while(iteratorN != 0) {
        sum += iteratorN % 10
        iteratorN = iteratorN / 10
    }
    
    return sum
}