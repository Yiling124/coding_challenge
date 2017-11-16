//Given a binary tree, return the inorder traversal of its nodes' values.
//
//  For example:
//  Given binary tree [1,null,2,3],
//  1
//  \
//  2
//  /
//  3
//  return [1,3,2].


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeInorderTraversal_94 {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> myList = new ArrayList<>();
    helper (root, myList);
    return myList;
  }

  private void helper(TreeNode root, List<Integer> myList) {
    if (root == null) {
      return;
    }
    helper(root.left, myList);
    myList.add(root.val);
    helper(root.right, myList);
  }
}
