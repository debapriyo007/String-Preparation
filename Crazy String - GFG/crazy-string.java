//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
             
            System.out.println(ob.getCrazy(S));
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution{
    static String getCrazy(String s)
    {
        //Your code here
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            arr[i+1]=Character.toUpperCase(arr[i+1]);
            else if(arr[i]>='A' && arr[i]<='Z')
            arr[i+1]=Character.toLowerCase(arr[i+1]);
        }
        String s1 = new String(arr);
        return s1;
    }
}