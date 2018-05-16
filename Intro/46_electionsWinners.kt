fun electionsWinners(votes: MutableList<Int>, k: Int): Int {
    var probableWinners = 0
    var theDelta: Int
    val currentMaxVotes = votes.max()
    
    if(k != 0) {
        for(i in votes.indices) {
            theDelta = currentMaxVotes!!.minus(votes[i])
            if(theDelta < k) {
                probableWinners++
            }
        }
    }
    else {
        if((votes.count { it == currentMaxVotes }) == 1) {
            probableWinners = 1
        }
        else {
            probableWinners = 0
        }
    }
    
    return probableWinners
}