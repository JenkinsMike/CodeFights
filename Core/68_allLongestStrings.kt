fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    val maxStrings = inputArray.map({ it.length }).max()
    
    return inputArray.filter({ it.length == maxStrings }).toMutableList()
}