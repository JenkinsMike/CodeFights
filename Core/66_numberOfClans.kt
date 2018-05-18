fun numberOfClans(divisors: MutableList<Int>, k: Int): Int {
    val friends: MutableList<Int> = MutableList(1) { 1 }
    
    for(i in 2..k) {
        var add = true
        
        friends.forEach {
            if(isFriend(divisors, it, i)) {
                add = false
            }
        }
        
        if(add) {
            friends.add(i)
        }
    }
    
    return friends.size
}

fun isFriend(divisors: MutableList<Int>, a: Int, b: Int): Boolean {
    for(i in divisors.indices) {
        if(!(a % divisors[i] == 0 && b % divisors[i] == 0) &&
           !(a % divisors[i] != 0 && b % divisors[i] != 0)) {
            return false
        }
    }
    
    return true
}