fun newNumeralSystem(number: Char): MutableList<String> {
    var targetLetter = number.toInt() - 'A'.toInt()
    var rightAddendLetter = 0
    var lettersString = ""
    var letterList: MutableList<String> = mutableListOf<String>()

    for(i in 0..(targetLetter / 2)) {
        rightAddendLetter = targetLetter - i
        lettersString = i.toNewNumberString() + " + " + rightAddendLetter.toNewNumberString()
        letterList.add(lettersString)
    }

    return letterList
}

fun Int.toNewNumberString(): String {
    return (this + 'A'.toInt()).toChar().toString()
}