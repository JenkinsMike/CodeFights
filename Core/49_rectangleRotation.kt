fun rectangleRotation(a: Int, b: Int): Int {
    var x = (a / Math.sqrt(2.0)).toInt()
    var y = (b / Math.sqrt(2.0)).toInt()
    
    if((x + y) % 2 == 0) {
        return x * y + (x + 1) * (y + 1)
    }
    
    return (x + 1) * y + (y + 1) * x
}