fun areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean {
    val yourWeakest = minOf(yourLeft, yourRight)
    val friendsWeakest = minOf(friendsLeft, friendsRight)
    val yourStrongest = maxOf(yourLeft, yourRight)
    val friendsStrongest = maxOf(friendsLeft, friendsRight)
    
    return ((yourWeakest == friendsWeakest) && (yourStrongest == friendsStrongest))
    /**
     * Mike was long form for the below
     * fun areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int) = setOf(yourLeft, yourRight) == setOf(friendsLeft, friendsRight)
     */
}