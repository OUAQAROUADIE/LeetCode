class Solution {
    public int singleNumber(int[] nums) {
       int r= 0;
       for(int n : nums){
        r ^=n;
       }
       return r;
    }
}