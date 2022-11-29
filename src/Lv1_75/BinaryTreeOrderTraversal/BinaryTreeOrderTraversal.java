package Lv1_75.BinaryTreeOrderTraversal;

import java.util.ArrayList;
import java.util.List;
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

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>(); // 최종답안
        Stack<TreeNode> toVisit = new Stack<>(); // 한 층 을 담을 스택, 매 층마다 비워지고 그 다음 층으로 채워짐
        toVisit.push(root);

        while (true) {
            List<Integer> tmp = new ArrayList<>(); // answer에 넣을 한 층의 리스트

            List<TreeNode> oneLoop = new ArrayList<>(); // 스택에 한 층을 담기전, 임시로 담는 리스트

            /* 한 층이 빌때까지 tmp에 요소를 담고, oneLoop에 그 밑의 층을 담음*/
            while (!toVisit.isEmpty()) {
                TreeNode pop = toVisit.pop();
                if (pop.left != null) oneLoop.add(pop.left);
                if (pop.right != null) oneLoop.add(pop.right);
                tmp.add(pop.val);
            }

            answer.add(tmp); // 최종답안에 한 층의 리스트를 넣는다

            if (oneLoop.isEmpty()) break; // 더이상 밑의 층이 없으면 끝냄

            for (int i = oneLoop.size() -1 ; i >= 0; i--) { // 스택에 다음 층을 담는다
                toVisit.push(oneLoop.get(i));
            }

        }

        return answer;
    }
}