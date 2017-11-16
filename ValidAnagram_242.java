//Given two strings s and t, write a function to determine if t is an anagram of s.
//
//  For example,
//  s = "anagram", t = "nagaram", return true.
//  s = "rat", t = "car", return false.
//
//  Note:
//  You may assume the string contains only lowercase alphabets.

class ValidAnagram_242 {
  public boolean isAnagram(String s, String t) {
    int[] myArray = new int[26];
    for (int i = 0; i < s.length(); i++) {
      myArray[s.charAt(i) - 'a'] ++;
    }

    for (int j = 0; j < t.length(); j++) {
      myArray[t.charAt(j) - 'a']--;
    }

    for (int k = 0; k < myArray.length; k++) {
      if (myArray[k] != 0) {
        return false;
      }
    }
    return true;
  }
}