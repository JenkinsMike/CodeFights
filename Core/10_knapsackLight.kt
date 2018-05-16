fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    var bothFlag: Boolean = false
    var weight1Flag: Boolean = false
    var weight2Flag: Boolean = false
    var neitherFlag: Boolean = false
    
    if((weight1 > maxW) && (weight2 > maxW)) {
        neitherFlag = true
    }
    
    if((weight1 + weight2) <= maxW) {
        bothFlag = true
    }
    
    if(weight1 <= maxW) {
        weight1Flag = true
    }
    
    if(weight2 <= maxW) {
        weight2Flag = true
    }
    
    if(bothFlag) {
        return value1 + value2
    }
    else if(neitherFlag) {
        return 0
    }
    else if((weight1Flag) && (weight2Flag)) {
        return maxOf(value1, value2)
    }
    else if(weight1Flag && !weight2Flag) {
        return value1
    }
    else if(!weight1Flag && weight2Flag) {
        return value2
    }
    else {
        return 0
    }
}