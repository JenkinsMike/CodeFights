fun additionWithoutCarrying(param1: Int, param2: Int): Int {
    var carryFlag = false
    var p1Array_I = param1.toString().toCharArray().map { it.toInt() - '0'.toInt() }
    var p2Array_I = param2.toString().toCharArray().map { it.toInt() - '0'.toInt() }
    var maxArraySize = maxOf(p1Array_I.size, p2Array_I.size)
    var noCarryArray = IntArray(maxArraySize)
    var addend1 = 0
    var addend2 = 0
    var sum = 0
    var result = 0
    
    for(i in 0..maxArraySize - 1) {
        if(i <= p1Array_I.size - 1) {
            addend1 = p1Array_I[p1Array_I.size - 1 - i]
        }
        
        if(i <= p2Array_I.size - 1) {
            addend2 = p2Array_I[p2Array_I.size - 1 - i]
        }
        
        sum = addend1 + addend2
        
        if(sum >= 10) {
            sum = sum - 10
        }
        
        noCarryArray[maxArraySize - 1 - i] = sum
        
        addend1 = 0
        addend2 = 0
        sum = 0
    }
    
    result = noCarryArray.map { it.toString() }.reduce { acc, s -> acc.plus(s) }.toInt()
    
    return result
}