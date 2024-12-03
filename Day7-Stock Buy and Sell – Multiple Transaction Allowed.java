class Solution {
    public int maximumProfit(int prices[]) {
        // code here
         int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {
        // If the current price is higher than the previous day's price, add the profit
        if (prices[i] > prices[i - 1]) {
            maxProfit += prices[i] - prices[i - 1];
        }
    }

    return maxProfit;
    }
}
