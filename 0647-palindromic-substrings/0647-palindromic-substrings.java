class Solution {
    
    //Check palindrom or not.
    public static boolean isPalindrom(String s){
        for(int  i = 0 ;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }return true;
    }
    
    public int countSubstrings(String s) {
        
        //substring.
        int count = 0;
        for(int i = 0 ;i<s.length();i++){
            for(int j = i+1 ;j<= s.length();j++){
                if(isPalindrom(s.substring(i,j)) == true){
                    count++;
                }
            }
        }
        return count;
    }
}