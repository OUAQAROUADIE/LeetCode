class Solution {
    public boolean isPalindrome(String s) {
        String cs = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder bs = new StringBuilder(cs);
        
        String st  = bs.reverse().toString();

        return st.equals(cs);
    }
}