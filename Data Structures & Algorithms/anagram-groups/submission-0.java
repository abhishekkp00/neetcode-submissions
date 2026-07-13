class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> bmap = new HashMap<>();

        for(String st: strs){
            Map<Character, Integer> freq = new HashMap<>();

            for(char ch: st.toCharArray()){
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }

            if(!bmap.containsKey(freq)){
                bmap.put(freq, new ArrayList<>());
            }
            bmap.get(freq).add(st);            
        }      
        return new ArrayList<>(bmap.values());
    }
}
