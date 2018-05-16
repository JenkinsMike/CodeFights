fun appleBoxes(k: Int): Int {
    var red = 0
    var yellow = 0
    
    for(i in 0..k) {
        if(i % 2 == 0) {
            red = red + i * i
        }
        else {
            yellow = yellow + i * i
        }
    }
    
    return red - yellow
}