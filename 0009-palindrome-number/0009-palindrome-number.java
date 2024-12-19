class Solution {
    public boolean isPalindrome(int x) {
        if( x <0 ){return false;}
        int s =0 ;
        int a = x;
        while(x>0){
            int tmp = x % 10;
            s = s*10+tmp;
            x = x/10;
        }

        return a == s;

        
    }
}