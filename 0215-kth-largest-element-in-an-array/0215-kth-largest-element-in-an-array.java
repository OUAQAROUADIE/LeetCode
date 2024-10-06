class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> tas = new PriorityQueue<>();

        for(int num : nums){
            tas.add(num);

            if(tas.size() > k){
                tas.poll();
            }
        }
        return tas.peek();
    }
}