fun electionsWinners(votes: MutableList<Int>, k: Int): Int {
    val max = votes.max() ?: 0
    val probableWinners = votes.count { it + k > max }

    if(probableWinners > 0) {
        return probableWinners
    }

    if(votes.count { max == it } == 1) {
        return 1
    }
    else {
        return 0
    }
}