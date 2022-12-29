package LV2_75.RemoveNthNodeFromEndofList;

import java.util.ArrayList;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode toEnd = head;
        ArrayList<ListNode> nodes = new ArrayList<>();
        int length = 0;
        while (toEnd != null) {
            nodes.add(toEnd);
            toEnd = toEnd.next;
            length += 1;
        }

        if (length == 1) return null;

        int cutPlace = 0;
        if (n != 1) {
            cutPlace = length - n -1;
        } else { // 맨 뒤 삭제
            ListNode node = nodes.get(length-2);
            node.next = null;
            return head;
        }

        if (cutPlace == -1) return head.next; // 맨 앞 삭제

        ListNode node = nodes.get(cutPlace); // 중간 삭제

        node.next = node.next.next;

        return head;
    }
    public static void main(String[] args) {

    }
}