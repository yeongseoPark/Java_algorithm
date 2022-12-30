package LV2_75.PalindromeLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public boolean isPalindrome(ListNode head) {
        List vals = new ArrayList<>();
        int len = 0;
        while (head != null) {
            vals.add(head.val);
            head = head.next;
            len += 1;
        }

        if (len == 1) return true;

        List sub;
        List sub2;

        if (len % 2 == 0) {
            sub = vals.subList(0,len/2);
            sub2 = vals.subList(len/2, len);
        } else {
            sub = vals.subList(0, len/2);
            sub2 = vals.subList(len/2 + 1, len);
        }
        Collections.reverse(sub);

        return sub.equals(sub2);
    }
}
