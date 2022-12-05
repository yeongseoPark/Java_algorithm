package Lv1_75.MinClimbingStairs;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] allCosts = new int[cost.length+1];
        allCosts[cost.length] = 0; // n (도착)
        allCosts[cost.length - 1] = cost[cost.length - 1]; // n -1
        /* n - 2 ~ 0 */
        for (int i = cost.length - 2; i >= 0; i--) {
            allCosts[i] = cost[i] + Math.min(allCosts[i+1], allCosts[i+2]);
        }

        return Math.min(allCosts[0], allCosts[1]);
    }
}
