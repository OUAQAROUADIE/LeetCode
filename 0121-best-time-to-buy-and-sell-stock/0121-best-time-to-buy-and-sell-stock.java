class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int p =0;
        for(int i = 0 ; i  < prices.length ;i++){
            min = Math.min(min, prices[i]);
            p = prices[i]-min;
            max = Math.max(max, p);
        }

        return max;
    }
}