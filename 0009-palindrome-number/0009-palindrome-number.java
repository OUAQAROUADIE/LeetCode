class Solution {
    public boolean isPalindrome(int x) {
       String n = Integer.toString(x);

        String re = new StringBuilder(n).reverse().toString();

        return n.equals(re);

    }
}