class Solution {
    public int longestPalindrome(String s) {
       boolean valid = false;
        if(s.length() == 1){return 1;}
        Map<Character, Integer> map = new HashMap<>();
        if(map.size() == 1){return map.get(s.charAt(0));}
        int count =0;
        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int n : map.values()){
            if(n % 2 ==0){
                count +=n;
            }else{
                count += n-1;
                valid =true;
            }
        }
            if(valid){
                count++;
            
        }
        return count;
    
    
    }
}