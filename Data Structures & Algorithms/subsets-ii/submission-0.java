class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, ans, new ArrayList<>());
        return ans;
    }
    private void backtrack(int index, int[] nums, List<List<Integer>> ans, List<Integer> subset){
        if(index == nums.length){
            ans.add(new ArrayList<>(subset));
            return;
        } 

        subset.add(nums[index]);
        backtrack(index + 1, nums, ans, subset);

        subset.remove(subset.size() - 1);

        int idx = index + 1;
        while(idx < nums.length && nums[index] == nums[idx]) idx++;

        backtrack(idx, nums, ans, subset);
    }
}
