class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, target, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int start, int target, int[] nums,
                           List<Integer> comb, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] > target) break;

            comb.add(nums[i]);
            backtrack(i, target - nums[i], nums, comb, ans); // reuse allowed
            comb.remove(comb.size() - 1);
        }
    }
}