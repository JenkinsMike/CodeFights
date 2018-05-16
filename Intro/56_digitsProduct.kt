fun digitsProduct(product: Int): Int {
    var prodList = mutableListOf<Int>()
    var result = 0
    
    when(product) {
        0    -> return 10
        1    -> return 1
        else -> {
            var productCopy = product
            
            for(i in 9 downTo 2) {
                while(productCopy % i == 0) {
                    productCopy /= i
                    prodList.add(i)
                }
            }
            
            if(productCopy > 1) {
                return -1
            }
            
            for(i in (prodList.count() - 1) downTo 0) {
                result = 10 * result + prodList[i]
            }
            
            return result
        }
    }
}