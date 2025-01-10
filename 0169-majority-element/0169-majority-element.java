class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int tmp = 0;
        for(int  n : nums){
            if(c == 0){
                tmp = n;
            }
            c += (n == tmp) ? +1 : -1; 
        }
        return tmp;
    }
}