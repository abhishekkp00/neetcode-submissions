class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;


        for(int num: prices){
            if(num < min){
                min = num;
            }
            int profit = num - min;
            
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}
