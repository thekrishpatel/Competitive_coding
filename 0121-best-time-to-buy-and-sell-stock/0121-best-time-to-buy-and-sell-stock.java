class Solution {
    public static int maxProfit(int[] prices) {
        int max_Profit = 0;
        int profit = 0;
        int currPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= currPrice) {
                currPrice = prices[i];
            } else {
                profit = prices[i] - currPrice;
            }
            if (profit > max_Profit)
                max_Profit = profit;
        }
        return max_Profit;
    }
}