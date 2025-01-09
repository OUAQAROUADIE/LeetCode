class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int s = 0;
        while(x>0){
            int tmp = x % 10;
            s = s*10 + tmp;
            x = x/10;
        }
        return n == s;
    }
}