class Solution {
    List<String> result = new ArrayList<>();

    private void generate(StringBuilder sb, int n, int open, int close){
        if(sb.length() == 2 * n){
            result.add(new StringBuilder(sb).toString());
            return;
        }

        if(open < n){
            sb.append('(');
            generate(sb, n, open + 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close < open){
            sb.append(')');
            generate(sb, n, open, close + 1);
            sb.deleteCharAt(sb.length() - 1);
        }        
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        int close = 0;

        generate(sb, n, 0, 0);

        return result;
        
    }
}
