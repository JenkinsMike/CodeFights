int secondRightmostZeroBit(int n) {
    return (1 << Convert.ToString(n,2).ToCharArray().Reverse().ToList().IndexOf('0', Convert.ToString(n,2).ToCharArray().Reverse().ToList().IndexOf('0') + 1)) ;
}