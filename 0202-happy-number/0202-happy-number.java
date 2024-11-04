class Solution {
    public boolean isHappy(int n) {
        int a =n;
        int m = div(n);
        while(m != 1 && a != m){
            a = div(a);
            m=div(div(m));
        }
        return m == 1;
     
   
    }
    public int div(int n){
        int tmp =0, s=0;
        while(n > 0){
            tmp = n % 10;
            s += tmp*tmp; 
            n /=10;
        }
        return s;
    }
}