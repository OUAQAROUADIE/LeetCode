class Solution {
    public int climbStairs(int n) {
        if(n == 1){return 1;}
        if(n == 2){return 2;}
        int r = 0;
        int p = 1;
        int d = 2;
        for(int i = 3 ; i <= n ;i++ ){
            r = p+d;
            p = d;
            d = r;
        }
        return r;
        
    }
}