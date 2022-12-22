package LV2_75.HappyNumber;

import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        /* floyd's cycle detection */
        while (fast != 1 && slow != fast) {
            slow = getNext(slow); // 한 칸
            fast = getNext(getNext(fast)); // 두 칸
        }

        return fast == 1;
    }

    public int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int tmp = n % 10;
            n = n / 10;
            sum += tmp * tmp;
        }
        return  sum;
    }
}