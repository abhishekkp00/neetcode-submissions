class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 1;

        for(int i = 1; i < nums.length; i++){
            prefix[i] = nums[i -1] * prefix[i - 1];
        }

        suffix[nums.length - 1] = 1;
        for(int j = nums.length - 2; j >= 0; j--){
            suffix[j] = suffix[j + 1] * nums[j + 1]; 
        } 

        //combine
        for(int i = 0; i < nums.length; i++){
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}  
