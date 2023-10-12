//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int k = N-2;
        for(int i = N-1;i>0;i--){
            if(arr[i] <= arr[i-1]){// 3 1 4 2
                k--;
            }else{
                break;
            }  
        }
        if(k == -1){
            reverse(arr, 0 , N-1);
             for(int val :arr){
            list.add(val);
        }return list;
        }
        for(int i = N-1;i>0;i--){
            if(arr[i]>arr[k]){
                int tem = arr[i];
                arr[i] = arr[k];
                arr[k] = tem;
                break;
            }
        }
        reverse(arr, k+1, N-1);
        for(int val :arr){
            list.add(val);
        }return list;
    }
    public static void reverse(int nums[], int si , int ei){
        while(si<ei){
            int tem = nums[si];
            nums[si] = nums[ei];
            nums[ei] = tem;
            si++;
            ei--;
        }
    }
}