package LeetCode_ProgrammingSkills.LargestPerimeterTriangle;

import java.util.Arrays;

import java.util.*;

class Solution {
    public static int largestPerimeter(int[] nums) {
        // a + b > c 가 둘레의 조건

        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i : nums)
            ll.add(i);
        Collections.sort(ll);
        System.out.println(ll);

        for (int i = ll.size() - 3; i >=0; i--) {
            if (ll.get(i) + ll.get(i+1) > ll.get(i+2))
                return ll.get(i) + ll.get(i+1) + ll.get(i+2);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,2};

        largestPerimeter(nums);
    }
}

