class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] r = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int  i = 0 ; i < nums.length ; i++ ){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        int n = entryList.size();
        int j = 0;
        for(int i = 0 ; i < entryList.size() ; i++ ){
            if(i >= n-k){
                r[j] = entryList.get(i).getKey();
                j++;
            }
        }
        return r;


    }
}