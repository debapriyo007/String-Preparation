class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(!stk.isEmpty()){
                if(stk.peek() == ch){
                    stk.pop();
                }else{
                    stk.push(ch);
                }
            }else{
                stk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder("");
        while(!stk.isEmpty()){
            char el = stk.pop();
            sb.append(el);
        }return sb.reverse().toString();
    }
}