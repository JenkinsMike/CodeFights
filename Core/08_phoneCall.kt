fun phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int {
    var callTime = 0
    var callCoin = s
    var callCounter = 2
    
    if(callCoin - min1 >= 0) {
        callCoin = callCoin - min1
        callTime++
        while(callCoin > 0 && callCounter <= 10) {
            if(callCoin - min2_10 >= 0) {
                callCoin = callCoin - min2_10
                callTime++
                callCounter++
                if(callCoin < min2_10) {
                    break
                }
            }
        }
        
        while(callCoin > 0 && callCounter >= 11) {
            if(callCoin - min11 >= 0) {
                callCoin = callCoin - min11
                callTime++
                callCounter++
                if(callCoin < min11) {
                    break
                }
            }
        }
    }
    
    return callTime
}