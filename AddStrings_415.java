//Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
//
//  Note:
//
//  The length of both num1 and num2 is < 5100.
//  Both num1 and num2 contains only digits 0-9.
//  Both num1 and num2 does not contain any leading zero.
//  You must not use any built-in BigInteger library or convert the inputs to integer directly.


public class AddStrings_415 {
  public String addStrings(String num1, String num2) {
    StringBuilder sb = new StringBuilder();
    int idx1 = num1.length() - 1;
    int idx2 = num2.length() - 1;
    int carry = 0;
    while (idx1 >= 0 || idx2 >= 0) {
      int sum = 0;
      if (idx1 >= 0) sum += Integer.parseInt(num1.charAt(idx1) + "");
      if (idx2 >= 0) sum += Integer.parseInt(num2.charAt(idx2) + "");
      if (carry > 0) sum += carry;
      sb.append(String.valueOf(sum % 10));
      carry = sum / 10;
      idx1--;
      idx2--;
    }
    if (carry > 0) sb.append(carry);
    return sb.reverse().toString();
  }
}