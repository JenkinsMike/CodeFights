fun digitDegree(n: Int): Int {
    return getDegrees(n, 0)
}

fun getDegrees(n: Int, degree: Int): Int {
    var n2 = n
    
    if(n2 >= 10) {
        var temp = 0
        
        while(n2 > 0) {
            temp += n2 % 10
            n2 /= 10
        }
        
        return getDegrees(temp, degree + 1)
    }
    
    return degree
}