fun evenDigitsOnly(n: Int): Boolean = n.toString().map( { it.toInt() } ).all( { it % 2 == 0 } ))