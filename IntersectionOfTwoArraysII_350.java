//Given two arrays, write a function to compute their intersection.
//
//  Example:
//  Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
//


public class IntersectionOfTwoArraysII_350 {
  public int[] intersect(int[] nums1, int[] nums2) {
    List<Integer> result = new ArrayList<>();
    Map<Integer, Integer> trackMap = new HashMap<>();
    for (int i = 0; i <= nums1.length - 1; i++) {
      if (trackMap.containsKey(nums1[i])) {
        trackMap.put(nums1[i], trackMap.get(nums1[i]) + 1);
      } else {
        trackMap.put(nums1[i], 1);
      }
    }
    for (int j = 0; j <= nums2.length - 1; j++) {
      if (trackMap.containsKey(nums2[j]) && trackMap.get(nums2[j]) != 0) {
        result.add(0, nums2[j]);
        trackMap.put(nums2[j], trackMap.get(nums2[j]) - 1);
      }
    }
    int[] arrResult = new int[result.size()];
    for(int i = 0; i < result.size(); i++) {
      arrResult[i] = result.get(i);
    }

    return arrResult;
  }
}