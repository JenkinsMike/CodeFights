fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
    var newArray = inputArray
    
    for(i in newArray.indices) {
        if(newArray[i] == elemToReplace) {
            newArray[i] = substitutionElem
        }
    }
    
    return newArray
}