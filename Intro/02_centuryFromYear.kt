fun centuryFromYear(year: Int): Int {
    val centuryDivisor = 100
    val yy = year % centuryDivisor
    var century = year / centuryDivisor
    
    if(yy == 0) {
        return century
    }
    else {
        century = century + 1
        return century
    }
}