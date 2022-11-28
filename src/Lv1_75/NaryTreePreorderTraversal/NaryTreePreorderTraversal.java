package Lv1_75.NaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();

        Stack<Node> toVisit = new Stack<>();

        while (!toVisit.isEmpty()) {
            Node node = toVisit.pop();
            result.add(node.val);

            for (int i = node.children.size() - 1; i >= 0; i--) {
                toVisit.push(node.children.get(i));
            }
        }

        return result;
    }
}