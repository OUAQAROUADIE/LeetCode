class Solution {
    public boolean isPalindrome(String s) {
        String cs = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(cs);
        String st = sb.reverse().toString();

        return st.equals(cs);
    }
}