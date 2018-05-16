fun sudoku(grid: MutableList<MutableList<Int>>): Boolean {
    var tempList: MutableList<Int> = mutableListOf()
    var cubeCounter = 0
    
    //rows good? - start
    grid.forEach {
        if(it.size != it.distinct().count()) {
            return false
        }
    }
    //rows good? - end
    //columns good?
    for(row in grid.indices) {
        for(col in grid[row].indices) {
            if(col == 0) {
                tempList.add(grid[row][col])
            }
        }
    }
    
    if(tempList.size != tempList.distinct().count()) {
        return false
    }
    //columns good? - end
    //cubes good? - start
    for(row in 0 until grid.size step 3) {
        for(col in 0 until grid[row].size step 3) {
            for(innerRow in row until (row + 3)) {
                for(innerCol in col until (col + 3)) {
                    println("grid[innerRow][innerCol]" + grid[innerRow][innerCol] + " " + innerRow + " " + innerCol)
                    tempList[cubeCounter] = grid[innerRow][innerCol]
                    cubeCounter++
                }
            }
            
            println(tempList)
            cubeCounter = 0
            if(tempList.size != tempList.distinct().count()) {
                return false
            }
        }
    }
    //cubes good? - end
    return true
}