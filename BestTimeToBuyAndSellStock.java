class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length == 1) return maxProfit;
        int left = 0, right = 1;
        while(right < prices.length) {
            int currProfit = prices[right] - prices[left];
            if(prices[left] > prices[right]) {
                left = right;
            }
            if(currProfit > maxProfit) {
                maxProfit = currProfit;
            }
            right++;
        }
        return maxProfit;
    }
}
