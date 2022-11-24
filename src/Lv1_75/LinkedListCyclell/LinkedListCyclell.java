package Lv1_75.LinkedListCyclell;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode detectCycle(ListNode head) {
        int outBonud =  (int)Math.pow(10,5) + 1;
        while (head != null) {
            head.val = outBonud;
            head = head.next;
            if (head != null && head.val == outBonud) {
                return head;
            }

        }
        return null;
    }
}