fun stringsConstruction(a: String, b: String): Int {
    var count = 0
    var bString = b
    
    while(true) {
        var subCount = 0
        
        for(i in a) {
            if(bString.indexOf(i) > -1) {
                subCount++
                bString = bString.substring(0, bString.indexOf(i)) + bString.substring(bString.indexOf(i) + 1)
            }
        }
        
        if(subCount == a.length) {
            count++
        }
        else {
            break
        }
    }
    
    return count
}