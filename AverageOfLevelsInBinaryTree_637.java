//Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
//
//  Example 1:
//  Input:
//  3
//  / \
//  9  20
//  /  \
//  15   7
//  Output: [3, 14.5, 11]
//  Explanation:
//  The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class AverageOfLevelsInBinaryTree_637 {
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();
    Queue<TreeNode> myQueue = new LinkedList<>();
    myQueue.add(root);
    while (!myQueue.isEmpty()) {
      long sum = 0, count = 0;
      Queue<TreeNode> temp = new LinkedList<>();
      while(! myQueue.isEmpty()) {
        TreeNode cur = myQueue.remove();
        count++;
        sum += cur.val;
        if (cur.left != null) {
          temp.add(cur.left);
        }
        if (cur.right != null) {
          temp.add(cur.right);
        }
      }
      result.add(sum * 1.0 / count);
      myQueue = temp;
    }
    return result;
  }
}
