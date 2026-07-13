class Solution {
    public int maxArea(int[] heights) {
        int st = 0;
        int end = heights.length - 1;
        int maxi = 0;
        int store = 0;


        while(st < end){
            store = Math.min(heights[st], heights[end]) * (end - st);
            maxi = Math.max(maxi, store);
            if(heights[st] < heights[end]){
                st++;
            }else{
                end --;
            }
        }
        return maxi;
        
    }
}
