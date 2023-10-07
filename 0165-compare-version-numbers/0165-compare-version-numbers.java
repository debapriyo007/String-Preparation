class Solution {
    public int compareVersion(String version1, String version2) {
        
        //step 1: Store String removeing the dots.
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        
        //step 2: Cal the max length of this two array..
        int len = Math.max(v1.length, v2.length);
        
        //Step 3: Iterte through the max leng.
        for(int i = 0;i<len;i++){
            int num1 = i>=v1.length ? 0 : Integer.parseInt(v1[i]);
            int num2 = i>=v2.length ? 0 : Integer.parseInt(v2[i]);
        
            //step 4: which num is greater.
            if(num1<num2)return -1;
            if(num1>num2)return 1;
        } return 0;
        
    }
}