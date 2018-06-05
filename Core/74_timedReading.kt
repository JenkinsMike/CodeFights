fun timedReading(maxLength: Int, text: String): Int {
    var wordsList: MutableList <String> = text.replace("[^A-Za-z ]".toRegex(), "").split(" ").toMutableList()
    var skippedWords = 0

    /**
     * wrote it this way just because.
     * also read that a for loop is a little better on runtime than a forEach
     * ...but wanted to do it anyway.
    for(i in wordsList.indices) {
        if(wordsList[i].length <= maxLength) {
            skippedWords++
        }
    }
     */

    wordsList.forEach {
        if((it.length > 0) && (it.length <= maxLength)) {
            skippedWords++;
        }
    }

    return skippedWords
}