class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int j=0;
        int min = Integer.MAX_VALUE;;
        int s=0;
        for(int i = 0 ; i < nums.length ; i++){
            s += nums[i];

            while(s >=target){
                s -= nums[j];
                min = Math.min(min,i-j+1);
                j++;

            }
        }
        return (min != Integer.MAX_VALUE) ? min : 0;
       
    }
}