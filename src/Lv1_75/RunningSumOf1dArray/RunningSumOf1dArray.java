package Lv1_75.RunningSumOf1dArray;


class Solution {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];

        int tmp = 0;
        for(int i =0 ; i < nums.length; i++) {
            tmp += nums[i];
            sums[i] = tmp;
        }

        return sums;
    }
}

