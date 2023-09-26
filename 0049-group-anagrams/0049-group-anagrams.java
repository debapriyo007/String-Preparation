class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //base case.
        if(strs == null || strs.length == 0)return new ArrayList<>();
        //Create a HashMap..
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String freString = getFrequency(str);
            //Check my frequency string is exist on my map or not.
            if(map.containsKey(freString)){
                map.get(freString).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(freString, list);
            }
        }
        return new ArrayList<>(map.values());
        
    }
    
    //Calculate the frequency of the String.
    public static String getFrequency(String str){
        
        //create an frequecy array with 26 size..
        int freq[] = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder("");
        char c = 'a';
        for(int i : freq){
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();
    }
}