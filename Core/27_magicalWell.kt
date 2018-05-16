fun magicalWell(a: Int, b: Int, n: Int): Int {
    var total = 0
    
    for(i in 0 until n) {
        total = total + (a + i) * (b + i)
    }
    
    return total
}