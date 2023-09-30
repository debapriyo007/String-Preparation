class Solution {
    public int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        int len = Math.max(v1.length, v2.length);
        
        for(int i = 0;i<len;i++){
            int nums1 = i>=v1.length ? 0 : Integer.parseInt(v1[i]);
            int nums2 = i>= v2.length ? 0 : Integer.parseInt(v2[i]);
            
            if(nums1<nums2)return -1;
            if(nums1>nums2)return 1;
        }return 0;
    }
}