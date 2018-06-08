fun threeSplit(a: MutableList<Int>): Int {
    var counter = 0
    var stepper = 0
    var thirds = 0
    val sum = a.sum()

    for(i in a.indices) {
        stepper += a[i]
        if(stepper == sum / 3) {
            thirds = 0
            for(j in (i + 1) until (a.size - 1)) {
                thirds += a[j]
                if(thirds == sum / 3) {
                    counter++
                }
            }
        }
    }

    return counter
}