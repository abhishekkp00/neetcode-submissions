class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);
        int len = 1;
        int maxLen = 1;

        for (int j = 1; j < nums.length; j++){
            if(nums[j] == nums[j - 1] + 1){
                len++;
            }else if(nums[j] == nums[j - 1]){
                continue;
            }else{
                len = 1;
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
