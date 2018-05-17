fun differentSquares(matrix: MutableList<MutableList<Int>>): Int {
    var two_by_two: MutableSet<String> = mutableSetOf()
    
    for(row in 0..matrix.lastIndex - 1) {
        for(col in 0..matrix[row].lastIndex - 1) {
            two_by_two.add(matrix[row][col].toString() +
                           matrix[row][col + 1].toString() +
                           matrix[row + 1][col].toString() +
                           matrix[row + 1][col + 1].toString())
        }
    }
    
    return two_by_two.count()
}