class Solution {
    public int romanToInt(String s) {
        
        //Create a hashMap.
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);  //put all possible value
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
        int ans = 0; 
        int prevVal = 0; 
        
        for(int i = s.length()-1 ;i>=0;i--){
            char ch = s.charAt(i);
            int currVal = map.get(ch);
            if(currVal < prevVal){
                ans-= currVal;
            }else{
                ans+=currVal;
                prevVal =  currVal;
            }
        }return ans;
    }
}