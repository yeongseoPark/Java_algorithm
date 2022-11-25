package Lv1_75.BestTimeToBuyAndSellStocks;

/* kadane's algorithm */
class Solution {
    public int maxProfit(int[] prices) {
        int max_so_far = 0;
        int max_ending_here = 0;

        for (int i =1; i<prices.length; i++) {
            max_ending_here = Math.max(0, max_ending_here += prices[i] - prices[i-1]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
    }
}