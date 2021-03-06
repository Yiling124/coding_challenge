//Given a binary tree, determine if it is height-balanced.
//
//  For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
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
class BalancedBinaryTree_110 {
  public boolean isBalanced(TreeNode root) {
    if (root == null) return true;
    if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
      return false;
    return isBalanced(root.left)  && isBalanced(root.right);
  }

  private int getHeight(TreeNode root) {
    if (root == null) return 0;
    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
    return Math.max(leftHeight, rightHeight) + 1;
  }
}