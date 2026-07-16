class Solution {
    public int evalRPN(String[] tokens) {
        //make a stack
        Stack<Integer> st = new Stack<>();

        //a for loop
        for(int i = 0; i < tokens.length; i++){
            if (!tokens[i].equals("+") &&
                !tokens[i].equals("-") &&
                !tokens[i].equals("*") &&
                !tokens[i].equals("/")) {
                st.push(Integer.parseInt(tokens[i]));
            }
            else if(tokens[i].equals("+")){
                int ele1 = st.pop();
                int ele2 = st.pop();

                int res = ele1 + ele2;

                st.push(res);
            }
            else if(tokens[i].equals("-")){
                int ele1 = st.pop();
                int ele2 = st.pop();

                int res = ele2 - ele1;

                st.push(res);
            }
            else if(tokens[i].equals("*")){
                int ele1 = st.pop();
                int ele2 = st.pop();

                int res = ele1 * ele2;

                st.push(res);
            }
            else if(tokens[i].equals("/")){
                int ele1 = st.pop();
                int ele2 = st.pop();

                st.push(ele2 / ele1);
            }

        }
        return st.pop();
       
    }
}
