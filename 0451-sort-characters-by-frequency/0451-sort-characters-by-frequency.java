class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        String ans = "";
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        pq.addAll(map.keySet());
        while(!pq.isEmpty()){
            char ch =pq.remove();
            for(int i = 0 ;i<map.get(ch) ;i++){
                ans+= ch + "";
            }

        }return ans;

    }
}