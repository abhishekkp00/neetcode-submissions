class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combSum(0, candidates, new ArrayList<>(), ans, target);
        return ans;
    }
    private void combSum(int index, int[] nums, List<Integer> comb, List<List<Integer>> ans, int target){
        if(target == 0){
            ans.add(new ArrayList<>(comb));
            return;
        }
        if(index == nums.length || target < 0) return;
        

        comb.add(nums[index]);
        combSum(index + 1, nums, comb, ans, target - nums[index]);

        int idx = index + 1;
        while(idx != nums.length && nums[index] == nums[idx]){
            idx++;
        }
        comb.remove(comb.size() - 1);
        combSum(idx, nums, comb, ans, target);
    }
}
