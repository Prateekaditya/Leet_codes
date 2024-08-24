class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
        if(buyprice<prices[i]){
            int profit=prices[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        else{
            buyprice=prices[i];
        }
        }
        return maxprofit;
    }
}