//https://www.geeksforgeeks.org/problems/stock-buy-and-sell2615/1


class Solution {
    public int maximumProfit(int prices[]) {
        int profit = 0;
        int buy = prices[0];
        int sell = prices[0];
        int n = prices.length;
        
        for(int i=0; i<n-1; i++){
            while(i < n-1 && prices[i] >= prices[i+1]) i+= 1;
            buy = prices[i];
            while(i < n-1 && prices[i] <= prices[i+1]) i+= 1;
            sell = prices[i];
            
            profit += (sell-buy);
        }
        return profit;
    }
}
