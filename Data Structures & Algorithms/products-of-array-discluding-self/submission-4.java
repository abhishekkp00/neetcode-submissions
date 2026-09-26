class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];

        ans[0] = 1;

        for(int i = 1; i < nums.length; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int right = 1;

        for(int j = n - 1; j >= 0; j--){
            ans[j] *= right;
            right *= nums[j];
        }
        return ans;
    }
}  
