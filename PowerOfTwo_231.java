//Given an integer, write a function to determine if it is a power of two.

class PowerOfTwo_231 {
  public boolean isPowerOfTwo(int n) {
    if ( n <= 0) return false;
    if (n == 1) return true;
    while (n >= 2) {
      if (n != (n / 2 ) * 2 ) return false;
      n /= 2;
    }
    return true;
  }
}