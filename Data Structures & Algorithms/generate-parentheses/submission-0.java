class Solution {
    List<String> result = new ArrayList<>();

    private boolean isValid(StringBuilder str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '(') count++;
            else count--;

            if(count < 0) return false;
        }
        return count == 0;

    }

    private void generate(StringBuilder sb, int n){
        if(sb.length() == 2 * n){
            if(isValid(sb)) result.add(new StringBuilder(sb).toString());
            return;
        }

        sb.append('(');
        generate(sb, n);

        sb.deleteCharAt(sb.length() - 1);

        sb.append(')');
        generate(sb, n);

        sb.deleteCharAt(sb.length() - 1);
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();

        generate(sb, n);

        return result;
        
    }
}
