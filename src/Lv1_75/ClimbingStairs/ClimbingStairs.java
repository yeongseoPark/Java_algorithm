package Lv1_75.ClimbingStairs;

class Solution {
    public int climbStairs(int n) {
        // i -2 스텝 : 2step, i -1 스텝 : 1step
        int[] steps = new int[46];
        steps[1] = 1;
        steps[2] = 2;

        for (int i = 3; i <=n ; i++) {
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[n];
    }
}