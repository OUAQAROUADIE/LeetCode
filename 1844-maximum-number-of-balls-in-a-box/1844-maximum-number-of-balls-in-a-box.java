class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int n = highLimit - lowLimit+1;
       int[] nums = new int[n];
       int[] sum = new int[n];

        for(int i = 0 ; i < n ; i++){
            nums[i] = lowLimit;
            lowLimit++;
            while(nums[i] > 0){
                sum[i] += nums[i] % 10;
                nums[i] /= 10;
            }

        }
    
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int s : sum){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for(int tmp : map.values()){
            if(max < tmp){
                max = tmp;
            }
        }
        return max;

    }
}