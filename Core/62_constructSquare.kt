fun constructSquare(s: String): Int {
    val letters = IntArray(26).toMutableList()
    //val letters = IntArray(s.length + 1).toMutableList()
    var minNumber = Math.pow(10.0, (s.length - 1).toDouble()).toInt()
    var iterator = Math.sqrt(minNumber.toDouble()).toInt()
    var result = -1
    
    for(i in 0 until s.length) {
        letters[s.get(i) - 'a']++
    }
    
    letters.sort()
    
    while((iterator * iterator) < (minNumber * 10)) {
        var iteratorSquared = iterator * iterator
        var digits = IntArray(26).toMutableList()
        //var digits = IntArray(s.length + 1).toMutableList()
        
        while(iteratorSquared > 0) {
            digits[iteratorSquared % 10]++
            iteratorSquared /= 10
        }
        
        digits.sort()
        
        if(letters == digits) {
            result = iterator * iterator
        }
        
        iterator++
    }
    
    return result
}