fun replaceMiddle(arr: MutableList<Int>): MutableList<Int> {
    if(arr.size % 2 == 0) {
        arr[arr.size / 2 - 1] = arr[arr.size / 2 - 1] + arr[arr.size / 2]
        arr.removeAt(arr.size / 2)
        return arr
    }
    else {
        return arr
    }
}