fun avoidObstacles(inputArray: MutableList<Int>): Int {
    inputArray.sort()
    for(i in 1..inputArray[inputArray.lastIndex] + 1) {
        if(inputArray.all({ it % i != 0 })) {
            return (i)
        }
    }
    
    return inputArray.lastIndex + 1
}