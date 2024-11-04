class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] w = s.split(" ");
        if(w.length != pattern.length()){return false;}

        Map<String, Character>  map1 = new HashMap<>();
        Map<Character, String> map2 = new HashMap<>();
        
        
         for (int i = 0; i < w.length; i++) {
            char a = pattern.charAt(i);
            String b = w[i];

            if(map2.containsKey(a)){
                if(!map2.get(a).equals(b)){
                    return false;
                }
            }else{
                 map2.put(a,b);
            }         
            if(map1.containsKey(b)){
                if(!map1.get(b).equals(a)){
                    return false;
                }
            }else{
                map1.put(b,a);
            }
           
        }
        return true;
    }
}