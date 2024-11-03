class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){return false;}
        Map<Character,Integer> c1 = new HashMap<>();
        Map<Character,Integer> c2 = new HashMap<>();
        for(int i = 0 ; i < s.length();i++){
            if(!c1.containsKey(s.charAt(i))){
                c1.put(s.charAt(i),i);}
            if(!c2.containsKey(t.charAt(i))){
                c2.put(t.charAt(i),i);
            }

            if(!c1.get(s.charAt(i)).equals(c2.get(t.charAt(i)))){
                return false;
            }
        }                 
        return true;
    }
}