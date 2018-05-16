fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    val maxProducts = inputArray.size - 1
    var productsArray = IntArray(maxProducts)
    
    for(i in productsArray.indices) {
        productsArray[i] = inputArray[i] * inputArray[i + 1]
    }
    
    productsArray.sortDescending()
    return productsArray.first()
}