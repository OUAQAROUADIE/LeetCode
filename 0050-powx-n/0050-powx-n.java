class Solution {
    public double myPow(double x, int n) { 
        if( n < 0){
            return 1/pow(x , n);
        }  
        return pow(x,n);  
    }
    public double pow(double x, int n){
        if( n == 0){
            return 1;
        }
        double r = pow(x, n/2);
        if(n % 2 == 0){
            return r*r;
        }else{
            return x*r*r;
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
        
    
