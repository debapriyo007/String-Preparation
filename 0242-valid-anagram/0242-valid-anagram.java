class Solution {
    public boolean isAnagram(String s, String t) {

        /*<------------BRUTE FROCE APPPROACH---------------------->
                       Time Complexity ---> 0(nlog n)
                       Space complexity 0(n+m)
        <--------------------------------------------------------->
        if(s.length()!= t.length()){ 
            return false;
        }
        char arr[] = s.toCharArray();
        char arr2[]= t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;

        */
        
       /*<--------------------- APPROACH 2 OPTIMIZE WAY ------------------------->
                        Time Complexity ---> 0(n)
                        Space complexity 0(n)
        <--------------------------------------------------------->*/
        if(s.length()!= t.length()){ //check the two string length is equal or not.
            return false;
        }
        //creating an HashMap..
        HashMap<Character ,Integer> map = new HashMap<>();
        for(int i = 0 ;i<s.length();i++){ //iterate the string s ..
            char ch = s.charAt(i); //store each word in ch varriable
            map.put(ch , map.getOrDefault(ch, 0)+1); //if the word is already present in that map then put and update the frequency.
            //and if not present then put the key with value or frequency 1.
        }
        for(int i = 0 ;i<t.length();i++){ //iterate over t string..
            char ch = t.charAt(i); //store in varriable.
            if(map.get(ch)!= null){ //if the ch is not null
                if(map.get(ch)==1){ //if value of ch is 1 then remove the charecter.
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch)-1); //put the ch and decrease the frequency..
                }
            }else{
                return false; 
            }
        }
        return map.isEmpty(); //last check my map is empty or not..
        

        
    }
}