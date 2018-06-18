fun cipher26(message: String): String {
    var plaintextMessage = ""
    var cipherCharAsInt = 0
    var plaintextAsInt = 0
    var messagePrefixAsInt = 0

    for(i in 0 until message.length) {
        cipherCharAsInt = message[i].toInt() - 'a'.toInt()
        plaintextAsInt = cipherCharAsInt - messagePrefixAsInt
        if(plaintextAsInt < 0) {
            plaintextAsInt = plaintextAsInt + 26
        }

        plaintextMessage += (plaintextAsInt + 'a'.toInt()).toChar()
        messagePrefixAsInt = cipherCharAsInt
    }

    return plaintextMessage
}