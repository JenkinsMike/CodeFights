fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
    var pullCount = 0
    var errorCountOne = 0
    var errorCountTwo = 0
    
    for(i in 0..sequence.size - 2) {
        if(sequence[i] >= sequence[i + 1]) {
            errorCountOne++
        }
        
        if(i != 0) {
            if(sequence[i - 1] >= sequence[i + 1]) {
                errorCountTwo++
            }
        }
    }
    
    if(errorCountOne == 1 && errorCountTwo <= 1) {
        return true
    }
    else {
        return false
    }
}