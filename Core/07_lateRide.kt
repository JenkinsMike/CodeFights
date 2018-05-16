fun lateRide(n: Int): Int {
    val hourString = (n / 60).toString()
    val minString = (n % 60).toString()
    
    return sumDigits(hourString) + sumDigits(minString)
}

fun sumDigits(digitString: String): Int {
    var count = 0
    
    /**
     * this works, but at the time i wrote this, i wasn't
     * comfortable with forEach.
     */
    //digitString.forEach { count += it.toString().toInt() }
    for(i in 0..digitString.length - 1) {
        count = count + digitString[i].toString().toInt()
    }
    
    return count
}