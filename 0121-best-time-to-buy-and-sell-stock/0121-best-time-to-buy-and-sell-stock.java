class Solution {
    public int maxProfit(int[] prices) {
       if(prices == null ){
        return 0;
       }
       int min = prices[0];
       int max = 0;

       for(int i = 1; i < prices.length ; i++){
        if(min > prices[i]){
            min = prices[i];
        }else{
        int profit = prices[i] - min;
        if(max < profit){
            max = profit;
        }
        }

            
        }
       return max;
    }
    
}