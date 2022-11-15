package Lv1_75.MergeTwoSortedLists;

class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode cur     = preHead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                cur.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            cur = cur.next;
        }

        if (list1 != null ) {
            cur.next = list1;
        } else if(list2 != null) {
            cur.next = list2;
        }

        return preHead.next;
    }
}