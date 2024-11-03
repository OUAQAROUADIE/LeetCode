class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] r = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        int i=0,j=0;
        while(i < entryList.size()){
            if(i>= entryList.size() - k){
                r[j] = entryList.get(i).getKey();
                j++;
            }
            i++;
        }
        
return r;
    }
}