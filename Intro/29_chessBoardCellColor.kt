fun chessBoardCellColor(cell1: String, cell2: String): Boolean {
    var c1 = cell1.get(0).toInt() + cell1.get(1).toInt()
    var c2 = cell2.get(0).toInt() + cell2.get(1).toInt()
    
    return (c1 % 2) == (c2 % 2)
}