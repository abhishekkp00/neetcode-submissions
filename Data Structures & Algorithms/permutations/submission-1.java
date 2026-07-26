class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permute(list, nums, ans);

        return ans;
    }
    public void permute(List<Integer> tempList, int[] nums, List<List<Integer>> ans){

        if(tempList.size() == nums.length){
            ans.add(new ArrayList<>(tempList));
            return;
        }

        for(int num: nums){

            if(tempList.contains(num)){
                continue;
            }
            tempList.add(num);

            permute(tempList, nums, ans);

            tempList.remove(tempList.size() - 1);
        }
    } 
}
