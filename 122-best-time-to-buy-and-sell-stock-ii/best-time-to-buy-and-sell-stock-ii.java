class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        int minBuy = prices[0];
        for (int i : prices) {
            if (i < minBuy) {
                minBuy = i;
            } else if (i > minBuy && i - minBuy >= 0) {
                totalProfit += (i - minBuy);
                minBuy = i;
            }
        }
        return totalProfit;
    }
}