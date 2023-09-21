class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }else{
                if(stk.isEmpty()){
                    return false;
                }
                if((stk.peek()=='(' && ch == ')') ||
                  (stk.peek() == '{' && ch == '}') ||
                  (stk.peek() == '[' && ch == ']')){
                    stk.pop();
                }else{
                    return false;
                }
            }
        }
        if(stk.isEmpty()){
            return true;
        }return false;
    }
}