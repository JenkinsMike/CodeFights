fun arrayChange(inputArray: MutableList<Int>): Int {
    var counter = 0
    
    for(i in 0..inputArray.size - 2) {
        if(inputArray[i] >= inputArray[i + 1]) {
            var dif = (inputArray[i] + 1) - inputArray[i + 1]
            
            inputArray[i + 1] = (inputArray[i] + 1)
            counter = counter + dif
        }
    }
    
    return counter
}