fun reflectString(inputString: String): String {
    var reflected = ""

    for(i in inputString.indices) {
        reflected += Character.toString(('z'.toInt() - (inputString[i].toInt() - 'a'.toInt())).toChar())
    }

    return reflected
}