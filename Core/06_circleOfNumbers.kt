fun circleOfNumbers(n: Int, firstNumber: Int): Int {
    val nArray = Array(n, { i -> (i + 1) - 1 })
    var acrossThePond = (n / 2) + firstNumber
    
    if(acrossThePond >= n) {
        acrossThePond = acrossThePond - n
    }
    
    return nArray[acrossThePond]
}