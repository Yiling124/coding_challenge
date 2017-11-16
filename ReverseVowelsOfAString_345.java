//Write a function that takes a string as input and reverse only the vowels of a string.
//
//  Example 1:
//  Given s = "hello", return "holle".
//
//  Example 2:
//  Given s = "leetcode", return "leotcede".
//
//  Note:
//  The vowels does not include the letter "y".

class ReverseVowelsOfAString_345 {
  public String reverseVowels(String s) {
    if (s == null || s.length() == 0) return s;
    String vowels = "aeiouAEIOU";
    char[] word = s.toCharArray();
    int i = 0;
    int j = word.length - 1;
    while (i < j) {
      while (i < j && vowels.indexOf(word[i]) == -1 ) {
        i++;
      }
      while(i < j && vowels.indexOf(word[j]) == -1) {
        j--;
      }
      swap(word, i, j);
      i++;
      j--;
    }
    return new String(word);
  }

  private static void swap(char[] arr, int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}