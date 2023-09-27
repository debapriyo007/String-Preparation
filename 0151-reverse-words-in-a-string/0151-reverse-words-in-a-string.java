class Solution {
    public String reverseWords(String s) {
        
        //Step 1: base on space i store all word in an array..
        String words[] = s.split(" +");
        // step 2 : Create a stringBuilder 
        StringBuilder sb = new StringBuilder();
        
        //step 3: Iterate last index of the words array 
        //        first add the word and then add space.
        
        for(int i = words.length-1 ;i>=0 ;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}