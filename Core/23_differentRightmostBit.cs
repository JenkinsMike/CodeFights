int differentRightmostBit(int n, int m) {
    return differentBit(n, m);
}

int differentBit(int n, int m) {
    int resultBit = 1;
    int position = 0;

    for(int i = 0; i < 32; i++) {
        if(n % 2 != m % 2) {
		    break;
		}

	    position++;
	    n = n / 2;
	    m = m / 2;
    }

    for(int i = 0; i < position; i++) {
	    resultBit = resultBit * 2;
	}

    return resultBit;
}