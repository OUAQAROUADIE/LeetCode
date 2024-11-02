class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] tmp = new int[2];
     for(int i = 0 ; i < nums.length-1; i++){
        int j = i+1;
        int r = target- nums[i] ;
        while(j < nums.length ){
            if(r == nums[j]){
            tmp[0]=i;
            tmp[1]=j;

        }
                    j++;

        }
        
     }
return tmp;
     }
}
