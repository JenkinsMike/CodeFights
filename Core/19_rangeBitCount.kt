fun rangeBitCount(a: Int, b: Int): Int {
    var total = 0
    
    for(i in a..b) {
        var binaryStepper = Integer.toBinaryString(i).toString()
        total = total + binaryStepper.filter { it == '1' }.count()
    }
    
    return total
}