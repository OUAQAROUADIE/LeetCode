class Solution {
    public boolean isPalindrome(String s) {
        String st =  s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(st);
        String sbr = sb.reverse().toString();
        return sbr.equals(st);
    }
}