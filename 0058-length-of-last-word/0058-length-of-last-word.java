class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();

        int lastindex = s.lastIndexOf(' ');

        return s.length() - lastindex - 1;
    }
}