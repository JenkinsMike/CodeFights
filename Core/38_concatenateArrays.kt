fun concatenateArrays(a: MutableList<Int>, b: MutableList<Int>): MutableList<Int> {
    a.addAll(b)
    return a
    /**
     * Other ways -
     *     return ((a + b).toMutableList())
     *
     *     fun concatenateArrays(a: MutableList<Int>, b: MutableList<Int>) = a + b
     *     fun concatenateArrays(a: MutableList<Int>, b: MutableList<Int>) = a.plus(b)
     */
}