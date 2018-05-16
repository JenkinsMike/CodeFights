fun maxMultiple(divisor: Int, bound: Int): Int {
    var maxValue = divisor
    
    for(i in 1..bound) {
        if(maxValue + divisor <= bound) {
            maxValue = maxValue + divisor
        }
    }
    
    return maxValue
}