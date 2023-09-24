class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n==1){
            return n;
        }
        int count=1;
        int index=0;
        for(int i=1; i<=n; i++){
            count=1;
            while(i<n && chars[i]==chars[i-1]){
                count++;
                i++;
            }
            chars[index++]=chars[i-1];
            if(count!=1){
                String s = String.valueOf(count);
                for(char a:s.toCharArray()){
                    chars[index++]=a;
                }          
            }
        }
        return index;
    }
}