fun boxBlur(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    var blurredImage: MutableList<MutableList<Int>> = mutableListOf()
    //var blurredImage = mutableListOf<Int>()              //A way
    //var blurredImage: MutableList<Int> = mutableListOf() //Another way
    //var blurredImage: MutableList<Int> = mutableListOf(MutableList<Int>)
    
    for(row in 1..(image.size - 2)) {
        var blurredRow: MutableList<Int> = mutableListOf()
        for(col in 1..(image[row].size - 2)) {
            var blurredSum = 0
            for(blurredRow in (row - 1)..(row + 1)) {
                for(blurredCol in (col - 1)..(col + 1)) {
                    blurredSum += image[blurredRow][blurredCol]
                }
            }
            
            blurredRow.add(Math.floor(blurredSum.toDouble() / 9).toInt())
        }
        
        blurredImage.add(blurredRow)
    }
    
    return blurredImage
}