//Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//  For example:
//  Given binary tree [3,9,20,null,null,15,7],
//  3
//  / \
//  9  20
//  /  \
//  15   7
//  return its bottom-up level order traversal as:
//  [
//  [15,7],
//  [9,20],
//  [3]
//  ]


 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeLevelOrderTraversalII_107 {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    // List<List<Integer>> result = new ArrayList<List<Integer>>();
    // Queue<TreeNode> tempHolder = new LinkedList<TreeNode>();
    // tempHolder.add(root);
    // while(tempHolder.size() != 0) {
    //     List<Integer> oneLevel = new ArrayList<>();
    //     int length = tempHolder.size();
    //     while (tempHolder.size() <= length) {
    //         TreeNode cur = tempHolder.remove();
    //         if (cur.left != null) tempHolder.add(cur.left);
    //         if (cur.right != null) tempHolder.add(cur.right);
    //         oneLevel.add(cur.val);
    //     }
    //     result.add(0, oneLevel);
    // }
    // return result;


    List<List<Integer>> result = new ArrayList<List<Integer>>();
    List<TreeNode> thisLevel = new ArrayList<TreeNode>();

    if (root != null) thisLevel.add(root);

    while (!thisLevel.isEmpty()) {
      List<Integer> thisLevelResult = new ArrayList<Integer>();
      List<TreeNode> nextLevel = new ArrayList<TreeNode>();
      for (TreeNode node : thisLevel) {
        if (node.left != null) nextLevel.add(node.left);
        if (node.right != null) nextLevel.add(node.right);
        thisLevelResult.add(node.val);
      }
      thisLevel = nextLevel;
      result.add(0, thisLevelResult);
    }

    return result;
  }
}
