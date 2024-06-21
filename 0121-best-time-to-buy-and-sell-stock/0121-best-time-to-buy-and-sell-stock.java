class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxP=0;
        int minPrice=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else{
                maxP=Math.max(maxP,prices[i]-minPrice);
            }
        }
        
        return maxP;
    }
    
    
}