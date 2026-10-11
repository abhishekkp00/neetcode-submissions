class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list =
            new ArrayList<>(map.entrySet());

        // Sort by frequency in descending order
        list.sort((a, b) ->
            b.getValue().compareTo(a.getValue()));

        // Take the first k elements
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
        
    }
}
