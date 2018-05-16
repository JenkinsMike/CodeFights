fun isUnstablePair(filename1: String, filename2: String): Boolean {
    val filename1Lower = filename1.toLowerCase()
    val filename2Lower = filename2.toLowerCase()
    
    if((filename1 < filename2 && filename1Lower > filename2Lower) || (filename2 < filename1 && filename2Lower > filename1Lower)) {
        return true
    }
    else {
        return false
    }
}