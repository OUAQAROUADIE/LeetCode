class Solution {
    public int removeDuplicates(int[] nums) {
     Set<Integer> set = new HashSet<>();
int i =0;
     for(int n :nums){
        if(set.add(n)){
            nums[i]=n;
            i++;
        }
        
     }
     return i;
        
        
    }
}