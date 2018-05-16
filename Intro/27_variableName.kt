fun variableName(name: String): Boolean {
    for(i in 0 until name.length) {
        if(!(name[i] in 'a'..'z' || name[i] in 'A'..'Z' || name[i] in '0'..'9' || name[i] == '_')) {
            return false
        }
    }
    
    if(name[0] in '0'..'9') {
        return false
    }
    
    return true
}