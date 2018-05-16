fun leastFactorial(n: Int): Int {
    var factorial = 1
    var multiplier = 2
    while(factorial < n) {
        factorial = factorial * multiplier
        multiplier++
    }
    
    return factorial
}