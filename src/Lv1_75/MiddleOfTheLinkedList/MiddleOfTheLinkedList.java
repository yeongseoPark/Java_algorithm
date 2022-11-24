package Lv1_75.MiddleOfTheLinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        int n = 1;
        ListNode tmp = head;
        while(head.next != null) {
            head = head.next;
            n++;
        }

        for (int i =1 ; i < ((n/2) + 1); i++) {
            tmp = tmp.next;
        }
        return tmp;
    }
}