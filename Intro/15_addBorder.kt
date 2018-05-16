fun addBorder(picture: MutableList<String>): MutableList<String> {
    val asterisk: String = "*"
    val maxStringSize = picture.map { it.length }.max()
    val borderSize = maxStringSize?.plus(2)
    val borderTopBottom: String = asterisk.repeat(borderSize!!.toInt())
    
    for(i in picture.indices) {
        picture[i] = asterisk + picture[i] + asterisk
    }
    
    picture.add(0, borderTopBottom)
    picture.add(picture.size, borderTopBottom)
    
    return picture
}