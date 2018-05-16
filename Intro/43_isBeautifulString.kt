fun isBeautifulString(inputString: String): Boolean {
    if(inputString.any { it == 'a' }) {
        var beautifulList: MutableList<Int> = mutableListOf()
        
        for(i in 'a'..'z') {
            beautifulList.add(inputString.filter { it == i }.count())
        }
        
        for(i in 0..beautifulList.size - 2) {
            if(beautifulList[i] < beautifulList[i + 1]) {
                return false
            }
        }
    }
    else {
        return false
    }
    
    return true
}