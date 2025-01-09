class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length();
        while(i > 0 && s.charAt(i-1) == ' '){
            i--;
        }
        int n = i;
        while(i > 0 && s.charAt(i-1) != ' '){
            i--;
        }
        return n-i;
    }
}