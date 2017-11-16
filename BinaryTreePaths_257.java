//Given a binary tree, return all root-to-leaf paths.
//
//  For example, given the following binary tree:
//
//  1
//  /   \
//  2     3
//  \
//  5
//  All root-to-leaf paths are:
//
//  ["1->2->5", "1->3"]


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePaths_257 {
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> allPath = new ArrayList<String>();
    if (root != null) {
      onePath(root, "", allPath);
    }
    return allPath;
  }

  private void onePath(TreeNode root, String path,  List<String> allPath) {
    if (root.left == null && root.right == null) {
      allPath.add(path + root.val);
    }
    if (root.right != null) {
      onePath(root.right, path + root.val + "->", allPath);
    }
    if (root.left != null) {
      onePath(root.left, path + root.val+ "->", allPath);
    }
  }
}