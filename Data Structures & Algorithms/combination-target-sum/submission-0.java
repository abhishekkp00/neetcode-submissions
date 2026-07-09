class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans, new ArrayList<>(), target);
        return ans;

    }
    private void backtrack(int index, int[] nums, List<List<Integer>> ans, List<Integer> comb, int target){
        
        if(target < 0 || index == nums.length) return;
        if(target == 0){
            ans.add(new ArrayList<>(comb));
            return;
        } 

        comb.add(nums[index]);
        backtrack(index , nums, ans, comb, target - nums[index]);

        comb.remove(comb.size() - 1);

        backtrack(index + 1, nums, ans, comb, target);

        
    }
}
