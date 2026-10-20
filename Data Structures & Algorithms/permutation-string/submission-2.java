class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int[] freq1 = new int[26];
        int freq2[] = new int[26];

        for (char ch : s1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        int len = s1.length();

        int st = 0;
        int end = s1.length() - 1;

        for(int i = st; i <= end; i++){
            freq2[s2.charAt(i)- 'a']++;
        }

        while(end < s2.length()){
            if(Arrays.equals(freq1, freq2)){
                return true;
            }

            freq2[s2.charAt(st) - 'a']--;

            st++;
            end++;

            if(end < s2.length()){
                freq2[s2.charAt(end) - 'a']++;
            }
        }
        return false;
    }
}
