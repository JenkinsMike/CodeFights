fun isPower(n: Int): Boolean {
    var upperBound = Math.round(Math.sqrt(n.toDouble()))
    
    if(n == 1) {
        return true
    }
    
    for(i in 2..upperBound) {
        for(j in 2..upperBound) {
            if(Math.pow(i.toDouble(), j.toDouble()) == n.toDouble()) {
                return true
            }
        }
    }
    
    return false
}