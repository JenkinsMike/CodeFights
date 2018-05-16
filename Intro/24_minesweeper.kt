fun minesweeper(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> {
    var resultMatrix: MutableList<MutableList<Int>> = mutableListOf()
    
    for(row in matrix.indices) {
        for(col in matrix[row].indices) {
            var mines = 0
            for(innerRow in (Math.max(0, row - 1))..(Math.min(matrix.size - 1, row + 1))) {
                for(innerCol in (Math.max(0, col - 1))..(Math.min(matrix[row].size - 1, col + 1))) {
                    if(matrix[innerRow][innerCol] && (innerCol != col || innerRow != row)) {
                        mines++
                    }
                }
            }
            
            resultRow.add(mines)
        }
        
        resultMatrix.add(resultRow)
    }
    
    return resultMatrix
}
