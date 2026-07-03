class Solution {
    public int maxProfit(int[] prices) {
        int buyDate = prices.length - 1, sellDate = prices.length - 1, profit = 0, largestPrice = prices[prices.length - 1], lowestPrice = prices[prices.length - 1];
        // How do I check that the index of the largestPrice is greater
        // than the index of the lowestPrice
        for (int i = prices.length - 1 ; i >= 0; i--) {
            if (prices[i] > largestPrice) {
                largestPrice = prices[i];
                sellDate = i;
            }
            if (prices[i] < lowestPrice || ( i < sellDate && prices[i] < largestPrice && largestPrice - prices[i] > profit)) {
                lowestPrice = prices[i];
                buyDate = i;
            }
            if (largestPrice - lowestPrice >= 0 &&  sellDate > buyDate) {
                profit = largestPrice - lowestPrice;
            }
        }
        return profit;
    }
}