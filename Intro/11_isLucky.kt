fun isLucky(n: Int): Boolean {
    var rHalf: Int = 0
    var lHalf: Int = 0
    val nCharArray = n.toString().toCharArray()
    
    for(i in 0..(n.toString().length / 2) - 1) {
        rHalf = rHalf + (nCharArray[i].toInt() - '0'.toInt())
    }
    
    for(i in (n.toString().length / 2)..(n.toString().length - 1)) {
        lHalf = lHalf + (nCharArray[i].toInt() - '0'.toInt())
    }
    
    return rHalf == lHalf
}