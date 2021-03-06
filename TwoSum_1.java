//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//  You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//  Example:
//  Given nums = [2, 7, 11, 15], target = 9,
//
//  Because nums[0] + nums[1] = 2 + 7 = 9,
//  return [0, 1].


class BalancedBinaryTree_110 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> myMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if(myMap.containsKey(nums[i])) {
        int[] result = {myMap.get(nums[i]), i};
        return result;
      }
      myMap.put(target - nums[i], i);
    }
    int[] result = {};
    return result;
  }
}