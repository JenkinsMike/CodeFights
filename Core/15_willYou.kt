fun willYou(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean {
    if((young) && (beautiful) && (loved)) {
        return false
    }
    else if(!(young && beautiful) && (!loved)) {
        return false
    }
    else {
        return true
    }
}