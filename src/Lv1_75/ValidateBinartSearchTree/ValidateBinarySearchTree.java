package Lv1_75.ValidateBinartSearchTree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    boolean validate(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if (min != null && root.val <= min) return false;
        if (max != null && root.val >= max) return false;

        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }
}
