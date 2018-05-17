fun differentSquares(matrix: MutableList<MutableList<Int>>): Int {
    var two_by_two_a = HashSet<String>()
    var two_by_two_b = mutableListOf<String>()
    
    for(row in 0..matrix.lastIndex - 1) {
        for(col in 0..matrix[row].lastIndex - 1) {
            two_by_two_a.add(matrix[row][col].toString() + matrix[row][col + 1].toString() + matrix[row + 1][col].toString() + matrix[row + 1][col + 1].toString())
            var temp = matrix[row][col].toString() + matrix[row][col + 1].toString() + matrix[row + 1][col].toString() + matrix[row + 1][col + 1].toString()
            
            if(temp !in two_by_two_b) {
                two_by_two_b.add(temp)
            }
        }
    }
    
    return two_by_two_a.count()
    //return two_by_two_b.size
    
    /**
     * Both work.  The Set and the List.
     */
}
