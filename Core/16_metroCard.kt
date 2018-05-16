fun metroCard(lastNumberOfDays: Int): MutableList<Int> {
    var nextNumberOfDays = mutableListOf<Int>()
    
    when(lastNumberOfDays) {
        28, 30 -> nextNumberOfDays.addAll(listOf(31))
        31     -> nextNumberOfDays.addAll(listOf(28, 30, 31))
        else   -> nextNumberOfDays.addAll(listOf(0))
    }
    
    return nextNumberOfDays
}
