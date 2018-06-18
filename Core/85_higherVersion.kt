fun higherVersion(ver1: String, ver2: String): Boolean {
    val v1 = ver1.split(".").toTypedArray().toMutableList()
    val v2 = ver2.split(".").toTypedArray().toMutableList()

    loop@ for(i in v1.indices) {
        val temp = v1[i].toInt() - v2[i].toInt()

        when {
            temp > 0 -> return true
            temp < 0 -> return false
            else     -> continue@loop
        }
    }

    /**
     *    This also works, but parseInt, I thought, was
     *    Java.
     *
     *    for(i in v1.indices) {
     *        val temp = Integer.parseInt(v1[i]) - Integer.parseInt(v2[i])
     *
     *        if(temp > 0) {
     *            return true
     *        }
     *        else if(temp < 0) {
     *            return false
     *        }
     *    }
     */

    return false
}