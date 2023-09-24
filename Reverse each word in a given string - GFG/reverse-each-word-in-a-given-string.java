//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
/*class Solution
{
   
    String reverseWords(String S)
    {
        // your code here
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch !='.'){
                sb.append(ch);
            }else{
                sb.reverse();
                ans+= sb;
                ans+='.';
                sb = new StringBuilder(""); //way of delete the stringBuilder.
            }
        }
        sb.reverse();
        ans+=sb;
        return ans;
        
    }
}*/

class Solution
{
   
    String reverseWords(String s)
    {
        // your code here
        String ans="",word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='.'){
            word+=s.charAt(i);
            
        }
        else{
            String rev="";
            for(int j=word.length()-1;j>=0;j--){
                rev+=word.charAt(j);
            }
            ans+=rev+".";
            word="";
        }
    }
    String rev="";
    for(int j=word.length()-1;j>=0;j--){
                rev+=word.charAt(j);
            }
            ans+=rev;
            return ans;
}
}