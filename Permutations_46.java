//Given a collection of distinct numbers, return all possible permutations.
//
//  For example,
//  [1,2,3] have the following permutations:
//  [
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//  ]

class Permutations_46 {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> current = new ArrayList<>();
    onePermute(nums, current, result);
    return result;
  }

  private static void onePermute(int[] nums, List<Integer> current, List<List<Integer>> result) {
    if (current.size() == nums.length) {
      List<Integer> toBeAdded = new ArrayList<>(current);
      result.add(toBeAdded);
      return;
    }
    for (int i = 0; i <= nums.length - 1; i++) {
      if (!current.contains(nums[i])) {
        current.add(nums[i]);
        onePermute(nums, current, result);
        current.remove(current.size() - 1);
      }
    }
  }
}