class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1 );
        }
int max = Integer.MIN_VALUE;
        int tmp =0;
        for(int key : map.keySet()){
        if(max < map.get(key)){
            max = map.get(key);
            tmp = key;
        }}
        return tmp;    
        }
}