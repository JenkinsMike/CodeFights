fun arithmeticExpression(a: Int, b: Int, c: Int): Boolean {
    when {
        (a + b) == c                     -> return true
        (a - b) == c                     -> return true
        (a * b) == c                     -> return true
        (a / b) == c && (a % b) == 0     -> return true
        else                             -> return false
    }
}