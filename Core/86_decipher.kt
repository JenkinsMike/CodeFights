fun decipher(cipher: String): String {
    var cipherMutable = cipher
    var cleartextString = ""

    while(cipherMutable.length > 0) {
        var takeSize = 2
        var charCheck = cipherMutable.takeThisInt(takeSize)

        if(!(charCheck >= 'a'.toInt() && charCheck <= 'z'.toInt())) {
            takeSize = 3
            charCheck = cipherMutable.takeThisInt(takeSize)
        }

        cleartextString += charCheck.toChar()
        cipherMutable = cipherMutable.takeLast(cipherMutable.length - takeSize)
    }

    return cleartextString
}

fun String.takeThisInt(takeSize: Int): Int {
    return take(takeSize).toInt()
}