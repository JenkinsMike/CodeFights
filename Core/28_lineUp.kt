fun lineUp(commands: String): Int {
    var sameCount = 0
    var sameFlag: Boolean = true
    var command: Char
    
    for(i in 0..commands.length - 1) {
        command = commands[i]
        if((command == 'L') || (command == 'R')) {
            if(!sameFlag) {
                sameCount++
            }
            
            sameFlag = !sameFlag
        }
        else {
            if(sameFlag) {
                sameCount++
            }
        }
    }
    
    return sameCount
}