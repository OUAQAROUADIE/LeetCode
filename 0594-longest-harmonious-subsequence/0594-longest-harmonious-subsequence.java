class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int  max=0;
        for(int i = 0 ; i < nums.length ;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0) +1);
        }

         
         for(int  c : map.keySet()){
            if(map.containsKey(c + 1)){
               int l = map.get(c) + map.get(c+1);
                max = Math.max(max, l);
            }
         }
         return max;
    }
}