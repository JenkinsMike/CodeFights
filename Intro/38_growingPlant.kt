fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
    var height = 0
    var days = 1
    
    while(true) {
        height += upSpeed
        if(height >= desiredHeight) {
            return days
        }
        
        height -= downSpeed
        days++
    }
}