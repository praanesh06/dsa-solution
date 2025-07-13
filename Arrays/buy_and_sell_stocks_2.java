//https://www.geeksforgeeks.org/problems/buy-stock-2/1

class Solution {
    public int maximumProfit(int prices[]) {
        int min = prices[0];
        int profit = 0;
        for(int i=0; i < prices.length; i++){
            if(prices[i] < min) min = prices[i];
            if(profit < (prices[i] - min)) profit = prices[i] - min;
        }
        return profit;
    }
}
