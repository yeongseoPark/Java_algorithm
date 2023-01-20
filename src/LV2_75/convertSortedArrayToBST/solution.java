package LV2_75.convertSortedArrayToBST;


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
/* BST
    1. root.left < root < root.right */

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode head = sorter(nums, 0, nums.length -1);
        return head;
    }

    public TreeNode sorter(int[] nums, int low, int high) {
        if (low > high) return null;

        int mid = low + (high - low) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = sorter(nums , low , mid - 1);
        node.right = sorter(nums, mid + 1, high);

        return node;
    }
}
