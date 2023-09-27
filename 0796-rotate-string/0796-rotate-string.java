class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length())return false;
        String str1 = s+s;
        return (str1.indexOf(goal)>=0);
    }
}