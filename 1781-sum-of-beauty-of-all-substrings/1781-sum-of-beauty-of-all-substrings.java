class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for(int i = 0 ;i<s.length();i++){
            int freq[] = new int[26];
            for(int j = i ;j<s.length();j++){
                freq[s.charAt(j) - 'a']++;
                int beauty = calbeauty(freq);
                ans+=beauty;
            }
        }return ans;
    }
    public int calbeauty(int[] freq){

        int min = Integer.MAX_VALUE; int max = Integer.MIN_VALUE ;

        for(int i = 0 ; i < freq.length ; i++){
            
            if(freq[i] != 0){//this is very very very important
                min = Math.min(freq[i],min);
            }
            max = Math.max(freq[i],max);
        }
        return max-min ;
    }

     

}