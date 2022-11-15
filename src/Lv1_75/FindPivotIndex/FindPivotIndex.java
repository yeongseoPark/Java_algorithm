package Lv1_75.FindPivotIndex;

import java.util.Arrays;


class Solution {

    /* 1 */
    public int pivotIndex(int[] nums) {
        int rightSum = Arrays.stream(nums).sum() - nums[0];

        if (rightSum == 0) return 0;

        int leftSum = 0;

        for (int i=1; i < nums.length; i++) {
            leftSum += nums[i-1];
            rightSum -= nums[i];

            if (leftSum == rightSum) return i;
        }

        return -1;
    }

    /* 2 -> stream으로 배열의 합 구하는 것보다 for-loop이 훨씬 빠르다 */
    public int pivotIndex2(int[] nums) {
        int left = 0, sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
        }

        for(int i=0;i<nums.length;i++) {
            sum -= nums[i];
            if(sum == left) return i;
            left += nums[i];
        }
        return -1;
        // TC : O(N)
        // SC : O(1)
    }

}