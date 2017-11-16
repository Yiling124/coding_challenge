//Given a binary tree, find its minimum depth.
//
//  The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MinimumDepthOfBinaryTree_111 {
  public int minDepth(TreeNode root) {
    if (root == null){
      return 0;
    }
    int leftResult = minDepth(root.left);
    int rightResult = minDepth(root.right);
    if (leftResult == 0) {
      return rightResult + 1;
    }
    if (rightResult == 0) {
      return leftResult + 1;
    }
    return Math.min(leftResult, rightResult) + 1;
  }
}
