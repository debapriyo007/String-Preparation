class Solution {
    //Check palindrom or not..
    /*public static boolean isPalindrom(String s){
        for(int  i = 0 ;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }return true;
    }*/
    public String longestPalindrome(String s) {
             
        /*String ans ="";
        for(int i = 0 ;i<s.length();i++){
            for(int j = i+1 ;j<= s.length();j++){
                String sub_str = s.substring(i,j);
                if(isPalindrom(sub_str) && sub_str.length() > ans.length()){
                    ans = sub_str;
                }
                
            }
        }
        return ans;*/
        
        int stIndx = 0;   //TC --> 0(n^2)
        int endIndx = 0;
        for(int i = 0 ;i<s.length();i++){
            int len1 = expandFromCenter(s, i,i+1);
            int len2 = expandFromCenter(s,i,i);
            int len = Math.max(len1, len2);
            if(endIndx - stIndx < len){
                stIndx = i-(len-1)/2;
                endIndx = i+(len)/2;
            }
        }
        return s.substring(stIndx , endIndx+1);
        
    }
    //TC --> 0(n)
    public static int expandFromCenter(String s, int i , int j){
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
            
        }return j-i-1;
    }
}