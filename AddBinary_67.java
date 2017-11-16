//Given two binary strings, return their sum (also a binary string).
//
//  For example,
//  a = "11"
//  b = "1"
//  Return "100".
//

class AddBinary_67 {
  public String addBinary(String a, String b) {
    if (a == null || a.isEmpty()) return b;
    if (b == null || b.isEmpty()) return a;
    int i = a.length() - 1;
    int j = b.length() - 1;
    int carry = 0;
    StringBuilder result = new StringBuilder();
    while (i >= 0 || j >= 0) {
      int sum = carry;
      if (i >= 0) sum += a.charAt(i) - '0';
      if (j >= 0) sum += b.charAt(j) - '0';
      result.append(sum % 2);
      carry = sum / 2;
      i--;
      j--;
    }
    if (carry > 0) {
      result.append(carry);
    }
    return new String(result.reverse());
  }
}
