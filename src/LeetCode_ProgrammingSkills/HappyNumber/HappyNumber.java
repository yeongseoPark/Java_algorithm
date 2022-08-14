package LeetCode_ProgrammingSkills.HappyNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();

        while (n != 1) {
            List<Integer> tmp = new ArrayList<Integer>();
            while (n != 0) {
                tmp.add(n % 10);
                n /= 10;
            }

            for (int i: tmp) {
                n += Math.pow(i,2);
            }

            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
        }
        return true;
    }
}