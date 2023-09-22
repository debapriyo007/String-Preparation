class Solution {
    public int lengthOfLongestSubstring(String s) {
        //base case.
        if(s.length() == 0)return 0;
        //Init ans with 1.
        int ans = 1;
        //Take a set..
        HashSet<Character> set = new HashSet<>();
        //Take two iterator.
        int left = 0;
        int right = 0;
        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(s.charAt(right));
                right++;
                int size = set.size();
                ans = Math.max(ans, size);
            }
        }
        return ans;
    }
}