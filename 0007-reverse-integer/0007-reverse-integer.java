class Solution {
    public int reverse(int x) {
    boolean n = x < 0;
    long s =0 ;
    while(x != 0){
        int tmp = x % 10;
        s =s *10+ tmp;
        x= x/10;
    }
    

    if( s > Integer.MAX_VALUE ||  s < Integer.MIN_VALUE){
        return 0;
    }
    return (int)s;
    }
}