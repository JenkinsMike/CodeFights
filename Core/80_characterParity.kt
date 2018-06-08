fun characterParity(symbol: Char): String {
    if(symbol.isDigit()) {
        if(symbol.toString().toInt() % 2 == 0) {
            return "even"
        }
        else {
            return "odd"
        }
    }
    else {
        return "not a digit"
    }
}