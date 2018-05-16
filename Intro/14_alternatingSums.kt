fun alternatingSums(a: MutableList<Int>): MutableList<Int> {
    var team1 = 0
    var team2 = 0
    
    for(i in a.indices) {
        if(i % 2 == 0) {
            team1 = team1 + a[i]
        }
        else {
            team2 = team2 + a[i]
        }
    }
    
    val alternatingArray: IntArray = intArrayOf(team1, team2)
    
    return alternatingArray.toMutableList()
}