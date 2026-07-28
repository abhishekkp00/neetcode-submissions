class Solution {

    List<String> ans = new ArrayList<>();

    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return ans;

        backtrack(digits, 0, new StringBuilder());

        return ans;
    }

    private void backtrack(String digits, int index, StringBuilder str) {

        if (index == digits.length()) {
            ans.add(str.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            str.append(letters.charAt(i));

            backtrack(digits, index + 1, str);

            str.deleteCharAt(str.length() - 1);
        }
    }
}