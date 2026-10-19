
class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int st = 0;
        int end = 0;
        int freq[] = new int[26];
        int maxFreq = 0;

        while (end < s.length()) {
            char ch = s.charAt(end);

            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            while ((end - st + 1) - maxFreq > k) {
                freq[s.charAt(st) - 'A']--;
                st++;
            }

            max = Math.max(max, end - st + 1);
            end++;
        }

        return max;
    }
}
