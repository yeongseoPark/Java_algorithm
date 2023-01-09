package LV2_75.InvertBinaryTree;


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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            TreeNode leftT = tmp.left;
            tmp.left = tmp.right;
            tmp.right = leftT;
            if (tmp.left != null) queue.add(tmp.left);
            if (tmp.right != null) queue.add(tmp.right);
        }

        return root;
    }
}