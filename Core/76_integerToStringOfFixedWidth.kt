fun integerToStringOfFixedWidth(number: Int, width: Int): String {
    var numberAsString: String = ""

    when {
        number.toString().length < width -> numberAsString = number.toString().padStart(width, '0')
        number.toString().length > width -> numberAsString = number.toString().takeLast(width)
        else                             -> numberAsString = number.toString()
    }

    return numberAsString
}