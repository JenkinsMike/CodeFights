fun countSumOfTwoRepresentations2(n: Int, l: Int, r: Int): Int {
    var result = 0
    var lAddend = l
    var rAddend: Int
    
    for(i in lAddend..r) {
        rAddend = n - i
        if((rAddend >= l) && (rAddend <= r) && (rAddend >= i)) {
            result++
        }
    }
    
    return result
}