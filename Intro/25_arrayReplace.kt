fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
    for(a in inputArray.indices) {
        if(inputArray[a] == elemToReplace) {
            inputArray[a] = substitutionElem
        }
    }
    
    return inputArray
}