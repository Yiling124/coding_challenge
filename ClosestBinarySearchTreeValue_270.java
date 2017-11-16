//Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
//
//  Note:
//  Given target value is a floating point.
//  You are guaranteed to have only one unique value in the BST that is closest to the target.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class ClosestBinarySearchTreeValue_270 {
  public int closestValue(TreeNode root, double target) {
    int a = root.val;
    TreeNode kid = target < a ? root.left : root.right;
    if (kid == null) {
      return a ;
    }
    int b = closestValue(kid, target);
    return Math.abs(a - target) < Math.abs(b - target) ? a : b ;
  }
}