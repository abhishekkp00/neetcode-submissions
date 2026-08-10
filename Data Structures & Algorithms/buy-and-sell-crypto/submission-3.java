class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }

            int ben = prices[i] - buy;

            sell = Math.max(ben, sell);
        }
        return sell;
    }
}
