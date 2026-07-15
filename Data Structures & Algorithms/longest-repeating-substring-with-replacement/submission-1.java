class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int st = 0;
        int end = 0;
        int maxFreq = 0;
        int maxWindow = 0;

        for(end = 0; end < s.length(); end++){
            freq[s.charAt(end) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(end) - 'A']);
            
            int windowSize = end - st + 1;
            if(windowSize - maxFreq > k){
                freq[s.charAt(st) - 'A']--;
                st++;
            }
            windowSize = end - st + 1;
            maxWindow = Math.max(maxWindow, windowSize);
        }
        return maxWindow;
        
    }
}
