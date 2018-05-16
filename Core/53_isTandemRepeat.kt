fun isTandemRepeat(inputString: String): Boolean {
    if(inputString.length % 2 == 0) {
        val chunkyList = inputString.chunked(inputString.length / 2)
 
        return chunkyList[0] == chunkyList[1]
    }
    else {
        return false
    }
}