class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int s = 1;
        int p = 1;

        for(int i = 0; i < n ; i++){
            ans[i] = s;
            s *= nums[i];
        }    

        for( int i = n-1 ; i >= 0 ;i--){
            ans[i] *= p;
            p *= nums[i]; 
        }

        return ans;    
    }
}