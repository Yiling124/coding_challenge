//Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
//
//  You may assume the integer do not contain any leading zero, except the number 0 itself.
//
//  The digits are stored such that the most significant digit is at the head of the list.
//


class PlusOne_66 {
  public int[] plusOne(int[] digits) {
    ArrayList<Integer> holder = new ArrayList<>();
    for (int i = digits.length - 1; i >= 0; i--) {
      holder.add(digits[i]);
    }
    int carryOver = 1;
    for (int j = 0; j <= holder.size() - 1; j++) {
      if (j == holder.size() - 1 && holder.get(j) == 9 && carryOver == 1) {
        holder.set(j, 0);
        holder.add(1);
        carryOver = 0;
      } else if (holder.get(j) == 9 && carryOver == 1) {
        holder.set(j, 0);
        System.out.println(holder);
        carryOver = 1;
      } else if(holder.get(j) < 9 && carryOver == 1) {
        holder.set(j, holder.get(j) + 1);
        carryOver = 0;
      } else {
        continue;
      }
    }
    int[] result = new int[holder.size()];
    int l = 0;
    for (int k = holder.size() - 1; k >=0; k--) {
      result[l] = holder.get(k);
      l++;
    }
    return result;
  }
}