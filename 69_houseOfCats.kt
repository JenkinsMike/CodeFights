fun houseOfCats(legs: Int): MutableList<Int> {
    var mutableLegs = legs
    var people: MutableList<Int> = mutableListOf<Int>()
    var peeps = 0
    
    while(mutableLegs >= 0) {
        var kitties = 0
        
        if((mutableLegs % 4 == 2) || (mutableLegs % 4 == 0)) {
            if(mutableLegs % 4 == 2) {
                kitties = 1
            }
            else {
                kitties = 0
            }
        }
        
        people.add(peeps + kitties)
        peeps += 2
        mutableLegs -= 4
    }
    
    return people
}