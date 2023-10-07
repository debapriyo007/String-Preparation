class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for(int i = 0 ;i<s.length();i++){
            int frq[] = new int [26];
            for(int j = i;j<s.length();j++){
                frq[s.charAt(j) - 'a']++;
                int min = getMin(frq);
                int max = getMax(frq);
                int beauty = max - min;
                ans+=beauty;
                
            }
        }return ans;
    }
    
    public static int getMin(int frq[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<26;i++){
            if(frq[i]!=0){
                min = Math.min(min,frq[i]);
            }
        }
        return min;
    }
    public static int getMax(int frq[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<26;i++){
            if(frq[i]!=0){
                max = Math.max(max,frq[i]);
            }
        }
        return max;
    }
}