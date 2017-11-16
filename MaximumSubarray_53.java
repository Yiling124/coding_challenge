//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//
//  For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
//  the contiguous subarray [4,-1,2,1] has the largest sum = 6.

class MaximumSubarray_53 {
  public int maxSubArray(int[] nums) {
    int max_ending_here = nums[0];
    int max_so_far = nums[0];
    for (int i = 1; i < nums.length; i++) {
      max_ending_here = Math.max(max_ending_here + nums[i], nums[i]);
      max_so_far = Math.max(max_ending_here, max_so_far);
    }
    return max_so_far;
  }
}