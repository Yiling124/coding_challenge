//Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//  Example 1:
//  Input: "Let's take LeetCode contest"
//  Output: "s'teL ekat edoCteeL tsetnoc"

class ReverseWordsInStringIII_557 {
  public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    String[] splitedStr = s.split(" ");
    for (String str : splitedStr) {
      sb.append(reverseString(str));
      sb.append(" ");
    }
    return sb.toString().trim();
  }
  private String reverseString(String s) {
    char[] chArr = s.toCharArray();
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
      char temp = chArr[i];
      chArr[i] = chArr[j];
      chArr[j] = temp;
      i++;
      j--;
    }
    return String.valueOf(chArr);
  }
}