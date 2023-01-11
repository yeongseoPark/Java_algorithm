package LV2_75.InvertBinaryTree;

public class DiatmeterofBinary {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        max = Math.max(max, l + r);

        return 1 + Math.max(l,r);
    }

    // 모든 노드에 대해 maxDepth(left) + maxDepth(right) 한 것 중 최댓값
}
