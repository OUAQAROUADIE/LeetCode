class Solution {
    public int reverse(int x) {
    if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
            return 0;
    }
    boolean negative = x < 0;
    if( x < 0){
        x=-x;
        negative =true;
    }
    long r =0;
    while( x != 0){
        int tmp = x % 10;
        r = r * 10 +tmp;
        x  = x/10;
        
    }
    if(negative){
        r = -r;
    }
    if (r < Integer.MIN_VALUE || r > Integer.MAX_VALUE) {
            return 0;
    }
    return (int)r;
    }
}