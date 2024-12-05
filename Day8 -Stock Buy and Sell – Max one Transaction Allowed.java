class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
        if (buyPrice < prices[i]) { // Profit calculation
            int profit = prices[i] - buyPrice; // Today's profit
            maxProfit = Math.max(maxProfit, profit);
        } else {
            buyPrice = prices[i];
        }
    }

    return maxProfit;
    }
}
