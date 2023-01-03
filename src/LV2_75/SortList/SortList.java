package LV2_75.SortList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    /* top-down merge sort */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head; // base case
        ListNode mid = getMid(head);
        ListNode left = sortList(head); // split : o(log n)
        ListNode right = sortList(mid);
        return merge(left, right); // merge : O(n)
    }

    ListNode getMid(ListNode head) { // Fast & Slow pointer
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    ListNode merge(ListNode list1, ListNode list2) { // O(n)
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {  // list1.val >= list2.val
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
}