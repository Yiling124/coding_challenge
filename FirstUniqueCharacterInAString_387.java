//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
//  Examples:
//
//  s = "leetcode"
//  return 0.
//
//  s = "loveleetcode",
//  return 2.

class FirstUniqueCharacterInAString_387 {
  public int firstUniqChar(String s) {
    int[] countArr = new int[26];
    for (char ch: s.toCharArray()) {
      countArr[ch - 'a'] ++;
    }
    for (int i = 0; i <= s.length() - 1; i++) {
      if (countArr[s.charAt(i) - 'a'] == 1) return i;
    }
    return -1;
  }
}