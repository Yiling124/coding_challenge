//Given a binary tree, return the preorder traversal of its nodes' values.
//
//  For example:
//  Given binary tree [1,null,2,3],
//  1
//  \
//  2
//  /
//  3
//  return [1,2,3].

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreePreorderTraversal_144 {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root == null) return result;
    helper(root, result);
    return result;
  }

  private void helper(TreeNode root, List<Integer> result) {
    if (root != null) {
      result.add(root.val);
    }
    if (root.left != null)  helper(root.left, result);
    if (root.right!= null)  helper(root.right, result);
  }
}