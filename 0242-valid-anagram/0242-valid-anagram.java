class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }


}
           /* if(s.length() != t.length()){return false;}
            Map<Character,Integer> map1 = new HashMap<>();
            Map<Character,Integer> map2 = new HashMap<>();

       

        for(int i = 0 ; i < s.length() ; i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
        }
        int i = 0;
        while( i < s.length()){
            while(map1.get(s.charAt(i)) == map2.get(t.charAt(i))){
                return true;
            }
        }
        return false;
    }
}*/

        /*List<Map.Entry<Character,Integer>> list1 = new ArrayList<>(map1.entrySet());
        List<Map.Entry<Character,Integer>> list2 = new ArrayList<>(map2.entrySet());

        list1.sort(Map.Entry.comparingByValue());
        list2.sort(Map.Entry.comparingByValue());

        Boolean a= list1.equals(list2);
        list1.sort(Map.Entry.comparingByKey());
        list2.sort(Map.Entry.comparingByKey());
        Boolean b = list1.equals(list2);

        return a && b;*/

    
