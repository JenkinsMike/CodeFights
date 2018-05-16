fun isInfiniteProcess(a: Int, b: Int): Boolean {
    if(a > b) {
        return true
    }
    
    return (b - a) % 2 != 0
}