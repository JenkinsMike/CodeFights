fun spiralNumbers(n: Int): MutableList<MutableList<Int>> {
    var spiralList = MutableList(n) { MutableList(n) { 0 } }
    /**
     *  As an Array that I'd have to "toMutableList()" everything
     *  //build
     *  val dim = arrayOf(n, n)
     *  val spiralArray = Array(dim[0], { IntArray(dim[1]) } )
     *  //fill
     *  spiralArray.forEachIndexed { i, it ->
     *      it.indices.forEach { j ->
     *      it[j] = 0
     *      }
     *  }
     *  // print
     *  spiralArray.forEach { println(it.asList()) }
     */
    var counter = 1
    var rowStart = 0
    var colStart = 0
    var rowEnd = n - 1
    var colEnd = n - 1
    var spiralSize = n * n
    
    while(counter <= spiralSize) {
        for(i in colStart..colEnd) {
            spiralList[rowStart][i] = counter++
        }
        
        for(j in (rowStart + 1)..rowEnd) {
            spiralList[j][colEnd] = counter++
        }
        
        for(i in (colEnd - 1) downTo colStart) {
            spiralList[rowEnd][i] = counter++
        }
        
        for(j in (rowEnd - 1) downTo (rowStart + 1)) {
            spiralList[j][colStart] = counter++
        }
        
        colStart++
        colEnd--
        rowStart++
        rowEnd--
    }
    
    return spiralList
}