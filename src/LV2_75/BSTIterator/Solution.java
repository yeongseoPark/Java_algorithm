package LV2_75.BSTIterator;

import java.util.Stack;

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

class BSTIterator {
    Stack<TreeNode> stack = new Stack();

    public BSTIterator(TreeNode root) {
        TreeNode cur = root;
        while(cur != null) {
            stack.push(cur);
            if (cur.left == null) {
                break;
            } else {
                cur = cur.left;
            }
        }
    }

    public int next() {
        TreeNode node = stack.pop();
        TreeNode cur  = node;

        if (cur.right != null) {
            cur = cur.right;
            while (cur != null) {
                stack.push(cur);
                if (cur.left != null)
                    cur = cur.left;
                else
                    break;
            }
        }
        return node.val;
    }

    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}