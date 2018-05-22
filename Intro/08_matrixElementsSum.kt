fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    var totalCost = 0
    
    for(row in matrix.indices) {
        for(col in matrix[row].indices) {
            if((matrix[row][col] == 0) && ((row + 1) <= matrix.lastIndex)) {
                matrix[row + 1][col] = 0
            }
            else {
                totalCost = totalCost + matrix[row][col]
            }
        }
    }
    
    return totalCost
}