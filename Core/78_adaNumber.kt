fun adaNumber(line: String): Boolean {
    val validValues = "0123456789ABCDEF#"//.toSet()
    var lineNoUnderscore = line.replace("_", "").toUpperCase()
    var lineBadChars = lineNoUnderscore.toUpperCase().filterNot{ validValues.contains(it) }

    if(line == null) {
        return false
    }

    if(lineBadChars.length > 0) {
        return false
    }

    if(lineNoUnderscore.contains('#')) {
        var lineSegmented = lineNoUnderscore.split('#')
        var base: Int? = lineSegmented[0].toIntOrNull()

        if(lineSegmented.size != 3) {
            return false
        }

        if((base == null) || (base!!.toInt() < 2) || (base!!.toInt() > 16)) {
            return false
        }

        if(lineSegmented[2] != "") {
            return false
        }

        if((lineSegmented[1].any{ !validValues.substring(0, base).contains(it) }) ||
           (lineSegmented[1] == "")) {
            println(validValues.substring(0, base))
            return false
        }
    }
    else {
        if(lineNoUnderscore == "") {
            return false
        }

        if(lineNoUnderscore.contains("[^0-9]".toRegex())) {
            return false
        }
    }

    return true
}