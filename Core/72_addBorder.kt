fun addBorder(picture: MutableList<String>): MutableList<String> {
    var pictureNew = mutableListOf("*".repeat(picture[0].length+2))
    
    for (a in picture) {
        pictureNew.add("*" + a + "*")
    }
    
    pictureNew.add("*".repeat(picture[0].length+2))
    
    return pictureNew
}