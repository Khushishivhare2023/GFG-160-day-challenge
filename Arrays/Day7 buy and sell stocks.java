class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                max=max+prices[i]-prices[i-1];
            }
        }
        return max;
    }
}
