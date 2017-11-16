//Write a function that takes a string as input and returns the string reversed.
//
//  Example:
//  Given s = "hello", return "olleh".

class ReverseString_344 {
  public String reverseString(String s) {
    char[] arr = s.toCharArray();
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
      swap(arr, i, j);
      i++;
      j--;
    }
    return new String(arr);
  }

  private static void swap(char[] arr, int i, int j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
