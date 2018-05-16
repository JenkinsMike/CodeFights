fun chessKnight(cell: String): Int {
    val boardMoves = arrayOf(intArrayOf(2,3,4,4,4,4,3,2),
                             intArrayOf(3,4,6,6,6,6,4,3),
                             intArrayOf(4,6,8,8,8,8,6,4),
                             intArrayOf(4,6,8,8,8,8,6,4),
                             intArrayOf(4,6,8,8,8,8,6,4),
                             intArrayOf(4,6,8,8,8,8,6,4),
                             intArrayOf(3,4,6,6,6,6,4,3),
                             intArrayOf(2,3,4,4,4,4,3,2))
    val row = cell.get(0) - 'a'
    val col = cell.get(1) - '1'
    
    return boardMoves[row][col]
}