fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    when {
        weight1 + weight2 <= maxW          -> return value1 + value2
        weight1 <= maxW && weight2 <= maxW -> return Math.max(value1, value2)
        weight1 <= maxW                    -> return value1
        weight2 <= maxW                    -> return value2
        else                               -> return 0
    }
}