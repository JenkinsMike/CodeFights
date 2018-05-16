fun squareDigitsSequence(a0: Int): Int {
    var sequenceList = mutableListOf<Int>()
    //var sequenceList:MutableList<Int> = mutableListOf() //Another way
    var base = a0
    var next: Int
    
    while(!sequenceList.contains(base)) {
        sequenceList.add(base)
        next = 0
        while(base > 0) {
            next = next + ((base % 10) * (base % 10))
            base = base / 10
        }
        
        base = next
    }
    
    return sequenceList.size + 1
}