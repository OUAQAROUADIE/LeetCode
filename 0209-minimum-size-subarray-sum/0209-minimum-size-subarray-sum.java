class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;;
        int j=0;
        int s =0;
        for(int i = 0 ; i < nums.length ; i++){
           s+=nums[i];
           while(s >= target){
            min = Math.min(min, i-j+1);
            s -=nums[j];
            j++;
           }

        }    
        return (min != Integer.MAX_VALUE) ? min : 0;
    }   
    
}