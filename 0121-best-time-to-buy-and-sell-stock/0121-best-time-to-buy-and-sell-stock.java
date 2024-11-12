class Solution {
    public int maxProfit(int[] prices) {
      if(prices.length  == 0 ){
        return 0;

      }

      int min = prices[0];
      int max=0;
      for(int  i = 0; i < prices.length; i++){
        if(min > prices[i]){
            min = prices[i];
        }else{
            max = Math.max(max, prices[i] - min);
        }
      }
      return max;
    }
    
}



/*
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
       return max;*/ 