class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st  = 0;
        int end = 0;
        int count = 0;

        Set<Character> set = new HashSet<>();

        while(end < s.length()){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(st));
                st++;
            }
            set.add(s.charAt(end));
            count = Math.max(count, end - st + 1);
            end++;
        }


        return count;
    }
}
