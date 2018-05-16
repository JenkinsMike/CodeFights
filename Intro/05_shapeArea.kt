fun shapeArea(n: Int): Int {
    var areaLoop = 0
    
    //for(i in 0..n) {    //INCLUSIVE
    for(i in 0 until n) {   //EXCLUSIVE
        var mathHolder = (i * 4)
        areaLoop = areaLoop + mathHolder
    }
    
    return areaLoop + 1
}