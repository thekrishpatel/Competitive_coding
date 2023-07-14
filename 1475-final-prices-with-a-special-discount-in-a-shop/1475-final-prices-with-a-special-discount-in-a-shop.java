class Solution {
    public int[] finalPrices(int[] prices) {
       Stack<Integer> sn = new Stack<>();
        int n[] = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            if (i == prices.length - 1) {
                sn.push(prices[i]);
            }
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    sn.push(prices[i] - prices[j]);
                    break;
                }
                if (j == prices.length - 1) {
                    sn.push(prices[i]);
                }
            }
        }
        for (int i = prices.length-1; i >= 0; i--) {
            n[i] = sn.pop();
        }
        return n;
    }
}