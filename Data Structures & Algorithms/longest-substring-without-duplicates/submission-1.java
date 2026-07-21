class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int st = 0;
        int end = 0;
        int count = 0;

        while (end < s.length()) {

            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                count = Math.max(count, end - st + 1);
                end++;
            } else {
                set.remove(s.charAt(st));
                st++;
            }
        }

        return count;
    }
}