//Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//  You may assume that the array is non-empty and the majority element always exist in the array.


class MajorityElement_169 {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> dic = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (dic.containsKey(nums[i])) {
        dic.put(nums[i], dic.get(nums[i]) + 1);
      } else {
        dic.put(nums[i], 1);
      }
    }

    int result = 0;
    for (Integer key : dic.keySet()) {
      if (dic.get(key) > nums.length / 2) {
        result = key;
        break;
      }
    }
    return result;
  }
}