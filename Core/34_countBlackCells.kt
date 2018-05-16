fun countBlackCells(n: Int, m: Int): Int {
    return (n + m - getGCD1(n, m) + (getGCD2(n, m) - 1) * 2)
    //return (n + m + getGCD2(n, m) - 2)  //Also works.
}

/**
 * Iterative get for GCD using Euclid algorithm
 */
fun getGCD1(a: Int, b: Int): Int {
    var a2 = a
    var b2 = b
    var c: Int
    while(b2 > 0) {
        c = a2 % b2;
        a2 = b2;
        b2 = c;
    }
    
    return a2;
}

/**
 * Recursive get for GCD
 */
fun getGCD2(a: Int, b: Int): Int {
    return (if(b == 0) a else getGCD2(b, a % b))
}