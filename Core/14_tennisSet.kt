fun tennisSet(score1: Int, score2: Int): Boolean {
    if(score1 > score2) {
        when {
            score2 >= 5 && score1 == 7 -> return true
            score2 < 5 && score1 == 6  -> return true
            else                       -> return false
        }
    }
    else if(score2 > score1) {
        when {
            score1 >= 5 && score2 == 7 -> return true
            score1 < 5 && score2 == 6  -> return true
            else                       -> return false
        }
    }
    else return false
}