package LeetCode_ProgrammingSkills.NaryTreePreorderTraversal;

import java.util.List;

import java.util.ArrayList;

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
    private List<Integer> arr = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) return arr;

        return search(root);
    }

    public List<Integer> search(Node nde) {
        
        if (nde.children.isEmpty()) {
            arr.add(nde.val);
//           1.  return arr; -> arr이라는 바깥의 변수에 결과가 업데이트 되기에 return arr필요하지 않다, return을 타고 값이 돌아올 필요가 없는 경우.
        } else {
            arr.add(nde.val);
            for (Node ch: nde.children) {
               search(ch);
            // return을 넣지 않음으로서 for문이 끝나기 전에 base case에서(자식이 없는 첫노드에서) 리턴된 상태로 끝나지 않게 함
            }
        }

        return arr; // 2. 여기서 모든 서칭이 끝나면 리턴해주기 때문
    }
}