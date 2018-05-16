fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    return ((statues.max() ?: 0) - (statues.min() ?: 0) - statues.lastIndex)
}