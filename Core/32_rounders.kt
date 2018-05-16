fun rounders(value: Int): Int {
    var smallestRound = 10
    var roundedValue = value
    
    while(roundedValue > smallestRound) {
        if(((roundedValue % smallestRound) / (smallestRound / 10)) < 5) {
            roundedValue = (roundedValue / smallestRound) * smallestRound
        }
        else {
            roundedValue = (roundedValue / smallestRound + 1) * smallestRound
        }
        
        smallestRound = smallestRound * 10
    }
    
    return roundedValue
}