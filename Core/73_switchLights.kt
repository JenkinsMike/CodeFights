fun switchLights(a: MutableList<Int>): MutableList<Int> {
    for(i in a.indices) {
        if(a[i] == 1) {
            for(j in 0..i) {
                a[j] = 1 - a[j]
            }
        }
    }

    return a
}