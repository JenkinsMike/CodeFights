fun fileNaming(names: MutableList<String>): MutableList<String> {
    val scrubbedStringArray = mutableListOf<String>()
    
    for(name in names) {
        if(!scrubbedStringArray.contains(name)) {
            scrubbedStringArray.add(name)
        }
        else {
            for(i in 1..Int.MAX_VALUE) {
                if(scrubbedStringArray.contains(name + "(" + i + ")")) {
                    continue
                }
                
                scrubbedStringArray.add(name + "(" + i + ")")
                break
            }
        }
    }
    
    return scrubbedStringArray
}