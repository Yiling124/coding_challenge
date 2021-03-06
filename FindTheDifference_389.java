//Given two strings s and t which consist of only lowercase letters.
//
//  String t is generated by random shuffling string s and then add one more letter at a random position.
//
//  Find the letter that was added in t.
//
//  Example:
//
//  Input:
//  s = "abcd"
//  t = "abcde"
//
//  Output:
//  e
//
//  Explanation:
//  'e' is the letter that was added.

class FindTheDifference_389 {
  public char findTheDifference(String s, String t) {
    char result = '\0';
    Map<Character, Integer> tracker = new HashMap<>();
    for (int i = 0; i <= s.length() - 1; i++) {
      if (tracker.containsKey(s.charAt(i))) {
        tracker.put(s.charAt(i), tracker.get(s.charAt(i)) + 1);
      } else {
        tracker.put(s.charAt(i), 1);
      }
    }
    for (int j = 0; j <= t.length() - 1; j++) {
      if (!tracker.containsKey(t.charAt(j))) {
        result = t.charAt(j);
      } else {
        tracker.put(t.charAt(j), tracker.get(t.charAt(j)) - 1);
      }
    }
    if (result != '\0') return result;
    for (Character key: tracker.keySet()) {
      if (tracker.get(key) < 0) result = key;
    }
    return result;
  }
}