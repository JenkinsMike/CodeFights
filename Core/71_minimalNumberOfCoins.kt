fun minimalNumberOfCoins(coins: MutableList<Int>, price: Int): Int {
    var value = 0
    var mutablePrice = price
    
    for(i in coins.indices.reversed()) {
        value += mutablePrice / coins[i]
        mutablePrice %= coins[i]
    }
    
    return value
}