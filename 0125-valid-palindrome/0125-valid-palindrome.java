class Solution {
    public boolean isPalindrome(String s) {
        
        //first i convert any UpperCase into Lower case..
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        //Now i oterate through my string..
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        
        //iterate through my string builder..
        for(int i = 0 ;i<sb.length()/2 ;i++){
            if(sb.charAt(i)!= sb.charAt(sb.length()-1-i)){
                return false;
            }
        }
        
        return true;
    }
}