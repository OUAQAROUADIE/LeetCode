class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

      for(int i = n-1 ; i >= 0 ; i--){
        if( digits[i] < 9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
      }

      int[] n_digits = new int[n+1];
      n_digits[0] = 1;
      return n_digits;
    }

}
