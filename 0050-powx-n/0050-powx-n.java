class Solution {
    public double myPow(double x, int n) {
        if( n > 0){
         return pow(x,n) ;
        }
        if( n < 0 && x != 0){
            return 1 / (pow(x, n));
        }
        return 1;
    }

    public double pow(double x , int n){
        if( n == 0){return 1;}
        double a = pow(x, n/2);
        if( n % 2 == 0){
            return a*a;
        }else{
            return x*a*a;
        } 
        
    }
}

        /*double r =1 ;
        int m = Math.abs(n);
        for(int i = 0 ; i < m ; i++){
            if( n > 0){
            r = r*x;
            }
            if(n < 0 && x !=0){
             r = r/x;
            }
            if(n == 0){
                return 1;
            }
        }
        return r;*/
        
    
