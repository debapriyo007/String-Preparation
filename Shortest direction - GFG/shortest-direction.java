//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String s = in.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.shortestPath(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String shortestPath (String S)
    {
        // your code here
        int x=0,y=0;
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='E')
            x++;
            else if(S.charAt(i)=='W')
            x--;
            else if(S.charAt(i)=='N')
            y++;
            else
            y--;
        }
        
            while(x>0){
                s.append("E");
                x--;
            }
             while(y>0){
                s.append("N");
                y--;
            }
            while(y<0){
                s.append("S");
                y++;
            }
            while(x<0){
                s.append("W");
                x++;
            }
            String result=s.toString();
        return result;
    }
}