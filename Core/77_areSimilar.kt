fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {
    var delta = 0

    for(i in 0..a.size - 1) {
        if(a[i] != b[i]) {
            delta++
            if(delta > 2) {
                return false
            }
        }
    }

    a.sort()
    b.sort()

    return a.equals(b)
}