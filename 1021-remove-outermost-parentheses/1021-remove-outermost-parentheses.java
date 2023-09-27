class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(stk.size()>0){
                    sb.append(ch);
                }
                stk.push(ch);
            }else{
                stk.pop();
                if(stk.size()>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}