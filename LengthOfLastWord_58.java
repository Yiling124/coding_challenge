//Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
//  If the last word does not exist, return 0.
//
//  Note: A word is defined as a character sequence consists of non-space characters only.
//
//  Example:
//
//  Input: "Hello World"
//  Output: 5

public class LengthOfLastWord_58 {
  public int lengthOfLastWord(String s) {
    String trimmed_s = s.trim();
    int last_whitespace_index = trimmed_s.lastIndexOf(' ');
    return trimmed_s.length() - 1 - last_whitespace_index;
  }
}
