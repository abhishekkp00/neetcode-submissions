class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find '#'
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Length of the next string
            int len = Integer.parseInt(str.substring(i, j));

            // Start of actual string
            int start = j + 1;

            // Extract string
            result.add(str.substring(start, start + len));

            // Move to next encoded string
            i = start + len;
        }

        return result;
    }
}