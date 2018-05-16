fun pagesNumberingWithInk(current: Int, numberOfDigits: Int): Int {
    var currentNumber = current
    var numOfDigits = numberOfDigits
    var digitsInCurrent = countDigitsInNumber(currentNumber)
    
    while(numOfDigits >= digitsInCurrent) {
        numOfDigits = numOfDigits - digitsInCurrent
        currentNumber++
        digitsInCurrent = countDigitsInNumber(currentNumber)
    }
    
    return currentNumber - 1
}

fun countDigitsInNumber(n: Int): Int {
    var count = 0
    var fullNumber = n
    
    while(fullNumber > 0) {
        count++
        fullNumber = fullNumber / 10
    }
    
    return count
}