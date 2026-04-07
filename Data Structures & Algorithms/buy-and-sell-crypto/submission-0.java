class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int n=prices.length-1;
        int sell= prices[n];
        while (n>0){
            for(int i=0;i<n;i++){
                if(prices[i]<prices[n]){
                    max_profit= Math.max(max_profit,(prices[n]-prices[i]));
                }
            }
            n--;
        }
        return max_profit;
    }
}
