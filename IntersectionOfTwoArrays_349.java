//Given two arrays, write a function to compute their intersection.
//
//  Example:
//  Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
//
//  Note:
//  Each element in the result must be unique.
//  The result can be in any order.


class IntersectionOfTwoArrays_349 {
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> dic = new HashSet<Integer>();
    ArrayList<Integer> arrList = new ArrayList<Integer> ();
    for (int i = 0; i <= nums1.length - 1; i++) {
      dic.add(nums1[i]);
    }
    for (int j = 0; j <= nums2.length - 1; j++) {
      if (dic.contains(nums2[j])) {
        arrList.add(nums2[j]);
        dic.remove(nums2[j]);
      }
    }
    // Integer[] result = arrList.toArray(new Integer[arrList.size()]);
    // return result;
    return arrList.stream().mapToInt(i->i).toArray();
  }
}