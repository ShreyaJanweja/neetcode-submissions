class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int mp = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>bestBuy){
                mp = Math.max(mp, prices[i]-bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return mp;
    }
}
