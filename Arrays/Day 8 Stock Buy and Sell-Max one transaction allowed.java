class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int maxprofit=0;
        int buyprices=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buyprices){
                int profit=prices[i]-buyprices;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprices=prices[i];
            }
        }
        return maxprofit;
    }
}