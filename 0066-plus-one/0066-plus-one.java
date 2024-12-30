class Solution {
    public int[] plusOne(int[] digits) {
        int  i = digits.length-1;
        while(i >= 0){
            if(digits[i] == 9){
                digits[i]=0;
                i--;
            }else{
                digits[i]= digits[i]+1;
                return digits;
            }
        }
return IntStream.concat(IntStream.of(1), IntStream.of(digits)).toArray();
    }
}