fun differentSymbolsNaive(s: String): Int {
    var uniqueHashSet = HashSet<Char>()
    //var uniqueHashSet = mutableListOf<Char>()
    //val uniqueHashSet : MutableList<Char> = arrayListOf()  //Alternative 1
    //val uniqueHashSet : MutableList<Char> = ArrayList()    //Alternative 2
    
    for(i in 0 until s.length) {
        uniqueHashSet.add(s.get(i))
    }
    
    return uniqueHashSet.size
}