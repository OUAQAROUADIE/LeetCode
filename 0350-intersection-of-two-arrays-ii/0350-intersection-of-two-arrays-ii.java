class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums1.length ; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
        }
        List<Integer> l = new ArrayList<>();
        for(int n: nums2){
            if(map.containsKey(n) && map.get(n) >0){
                l.add(n);
                map.put(n, map.get(n)-1);
            }
        }
            int[] n = new int[l.size()];
            for(int i= 0 ; i < l.size() ;i++){
                n[i] = l.get(i);
            }
            return n;
          
        }
        
    
}