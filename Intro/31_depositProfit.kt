fun depositProfit(deposit: Int, rate: Int, threshold: Int): Int {
    var year = 0
    var depositEOY = deposit.toDouble()
    
    while(depositEOY < threshold) {
        depositEOY += (depositEOY * rate / 100)
        year++
    }
    
    return year
}