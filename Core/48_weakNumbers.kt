fun weakNumbers(n: Int): MutableList<Int> {
    var weakest = 0
    var weakestCount = 0
    var weakList: MutableList<Int> = mutableListOf()
    
    for(i in 1..n) {
        weakList.add(howWeakAreYou(i))
    }
    /**
     * as a forEach
     * (1..n).forEach { i -> weakList.add(howWeakAreYou(i)) }
     */
    
    weakest = weakList.max() ?: 0
    weakestCount = weakList.count({ it == weakest })
    
    var weakestList = mutableListOf(weakest, weakestCount)
    
    return weakestList
}

fun howWeakAreYou(n: Int): Int {
    var weakness = 0
    var divisors = getDivisors(n)
    
    for(i in 1 until n) {
        if(divisors < getDivisors(i)) {
            weakness++
        }
    }
    
    return weakness
}

fun getDivisors(n: Int): Int {
    var divisorCount = 0
    
    for(i in 1..n) {
        if(n % i == 0) {
            divisorCount++
        }
    }
    
    return divisorCount
}