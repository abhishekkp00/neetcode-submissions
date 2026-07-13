class Solution {
    //Brute Force
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prod = 1;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    prod = prod * nums[j];
                }
            }
            ans[i] = prod;
            prod = 1;
        }
        return ans;
        
    }
}  
