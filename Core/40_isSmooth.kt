fun isSmooth(arr: MutableList<Int>): Boolean {
    if(arr.first() == arr.last()) {
        if(arr.size % 2 == 0) {
            return (arr.first() == (arr[arr.size / 2 - 1] + arr[arr.size / 2]))
        }
    }
    else {
        return arr.first() == arr[(arr.size - 1) / 2]
    }
    else {
        return false
    }
}