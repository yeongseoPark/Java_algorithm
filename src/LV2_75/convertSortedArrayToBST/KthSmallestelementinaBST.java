package LV2_75.convertSortedArrayToBST;

import java.util.Stack;

class Solution2 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack();

        while (root != null){
            stack.push(root);
            root = root.left;
        }

        while (k!=0) {
            TreeNode tmp = stack.pop();
            k--;

            if (k == 0) return tmp.val;

            TreeNode right = tmp.right;

            while (right != null) {
                stack.push(right);
                right = right.left;
            }
        }

        return -1;

    }
}
