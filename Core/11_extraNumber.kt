fun extraNumber(a: Int, b: Int, c: Int): Int {
    when {
        a == b -> return c
        a == c -> return b
        b == c -> return a
        else   -> return 0
    }
}