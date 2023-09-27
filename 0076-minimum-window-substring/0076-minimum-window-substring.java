class Solution {
    public String minWindow(String s, String t) {
        
        
        //base case 
        if(s.length() == 0 || s.length()<t.length())return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        
        int count = 0;
        int st = 0;
        int minLen = Integer.MAX_VALUE;
        int minLef= 0;
        for(int i = 0 ;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i)) >= 0){
                    count++;
                }
            }
            //when we found elegible window.
            while(count == t.length()){
                //save the length.
                if(minLen>i-st+1){
                    minLen = i-st+1;
                    minLef = st;
                }
                //remove
                if(map.containsKey(s.charAt(st))){
                    map.put(s.charAt(st), map.get(s.charAt(st))+1);
                    if(map.get(s.charAt(st))>0){count--;}
                }
                st++;
            }
        }
        if(minLen>s.length())return "";
        return s.substring(minLef,minLef+minLen);
    }
}