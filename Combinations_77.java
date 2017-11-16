//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
//  For example,
//  If n = 4 and k = 2, a solution is:
//
//  [
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//  ]

class Combinations_77 {
  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> current = new ArrayList<Integer>();
    int start = 1;
    findOne(n, k, start, current, result);
    return result;
  }

  private void findOne(int n, int k, int start, List<Integer> current, List<List<Integer>> result) {
    if (current.size() == k) {
      List<Integer> oneFound = new ArrayList<Integer>(current);
      result.add(oneFound);
    }
    for (int i = start; i <= n; i++) {
      if (!current.contains(i)) {
        current.add(i);
        findOne(n, k, i + 1, current, result);
        current.remove(current.size() - 1);
      }
    }
  }
}