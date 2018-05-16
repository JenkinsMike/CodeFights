fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {
    var cArray = mutableListOf<Int>()              //One way
    var dArray: MutableList<Int> = mutableListOf()  //Another way
    
    if(a == b) {
        return true
    }
    
    for(i in a.indices) if(a[i] != b[i]) {
        cArray.add(a[i])
        dArray.add(b[i])
    }
    
    if((cArray.size == 2) && (cArray == dArray.reversed())) {
        return true
    }
    
    return false
}