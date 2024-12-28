class Solution {
    public boolean isPalindrome(int x) {
    if(x < 0){return false;}
       int r = 0 ;
       int n = x;

       while(x > 0){
        int tmp = x % 10;
        r = r*10 + tmp;
        x = x/10;
       }
     return n == r;
    }
}