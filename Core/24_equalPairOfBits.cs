int equalPairOfBits(int n, int m) {
    return equalBit(n, m);
}

int equalBit(int n, int m) {
    int resultBit = 1;
    int position = 0;

    for(int i = 0; i < 32; i++) {
        if(n % 2 == m % 2) {
            break;
        }

    n = n / 2;
    m = m / 2;
    position++;
    }

for(int i = 0; i < position; i++) {
    resultBit = resultBit * 2;
    }

return resultBit;
}