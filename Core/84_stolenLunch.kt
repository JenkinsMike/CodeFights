fun stolenLunch(note: String): String {
    var noteAsList = note.toCharArray().toMutableList()

    for(i in note.indices) {
        if(note[i].toInt() >= '0'.toInt() && note[i].toInt() <= '9'.toInt()) {
            noteAsList[i] = noteAsList[i] + '1'.toInt()
        }

        if(note[i].toInt() >= 'a'.toInt() && note[i].toInt() <= 'j'.toInt()) {
            noteAsList[i] = noteAsList[i] - '1'.toInt()
        }
    }

    return noteAsList.joinToString("")
}