fun checkPalindrome(inputString: String): Boolean {
    val backwardsString = inputString.reversed()
    
    if(inputString.equals(backwardsString)) {
        return true
    }
    else {
        return false
    }
}