fun candles(candlesNumber: Int, makeNew: Int): Int {
    var burnt = 0
    var leftovers = 0
    
    for(i in candlesNumber downTo 1) {
        burnt++
        if(burnt % makeNew == 0) {
            leftovers++
            burnt++
        }
    }
    
    return burnt
}