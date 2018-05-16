fun crosswordFormation(words: MutableList<String>): Int {
    var crosswordCount = 0
    
    for(i in words.indices) {
        for(j in words.indices) {
            for(k in words.indices) {
                for(l in words.indices) {
                    if((i != j) && (i != k) && (i != l) && (j != k) && (j != l) && (k != l)) {
                        crosswordCount += crossCheck(words[i], words[j], words[k], words[l])
                    }
                }
            }
        }
    }
    
    return crosswordCount
}

fun crossCheck(a: String, b: String, c: String, d: String): Int {
    var crossCheckCount = 0
    
    //check word[0] - Horizontal
    for(aLoop1 in 0 until a.length) {
        //check word[0], but 2 chars over because crosswords - for Vertical 'D' cross
        for(aLoop2 in (aLoop1 + 2) until a.length) {
            //check word[1] - Vertical
            for(bLoop1 in 0 until b.length) {
                //check word[1], but 2 chars over because crosswords - for Horizontal 'C' cross
                for(bLoop2 in (bLoop1 + 2) until b.length) {
                    //check word[2]
                    for(cLoop1 in 0 until c.length) {
                        //check word[3]
                        for(dLoop1 in 0 until d.length) {
                            var cLoop2 = cLoop1 + (aLoop2 - aLoop1)
                            var dLoop2 = dLoop1 + (bLoop2 - bLoop1)
                            //check length
                            if((cLoop2 < c.length) && (dLoop2 < d.length)) {
                                //check match
                                if((a.get(aLoop1) == b.get(bLoop1)) && (a.get(aLoop2) == d.get(dLoop1)) && (b.get(bLoop2) == c.get(cLoop1)) && (c.get(cLoop2) == d.get(dLoop2))) {
                                    crossCheckCount++
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    return crossCheckCount
}
