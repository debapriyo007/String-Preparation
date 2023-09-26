class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //take a pointer at second last position .
        int k = n-2; //coz i apply my algo rigth side of k.
        for(int i = n-1 ;i>0 ;i--){
            if(nums[i] <= nums[i-1])k--;
            else break;
        }
        //if my k is -1 then reverse the array
        if(k == -1){
            reverse(nums, 0 , n-1);
            return;
        }
        
        for(int i = n-1 ;i>0 ;i--){
            if(nums[i] > nums[k]){
                //swap between i and k
                int tem = nums[k];
                nums[k] = nums[i];
                nums[i] = tem;
                break;
            }
        }
        //last rever the nums at k+1 position to n-1 pos.
        reverse(nums, k+1, n-1);
    }
    //Calculate the reverse function..
    
    public static void reverse(int arr[], int si, int ei){
        while(si<ei){
            int tem = arr[si];
            arr[si] = arr[ei];
            arr[ei] = tem;
            si++;
            ei--;
        }
    }
}