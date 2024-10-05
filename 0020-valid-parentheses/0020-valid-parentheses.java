class Solution {
    public boolean isValid(String s) {
        Stack<Character> pile = new Stack<>();

       HashMap<Character, Character> map = new HashMap<>();
       map.put(')', '(');
       map.put(']', '[');
       map.put('}', '{');

        for(char c : s.toCharArray()){
            if(map.containsValue(c)){
                pile.push(c);
            }else if(map.containsKey(c)){
                if(pile.isEmpty() || pile.pop() != map.get(c)){
                    return false;
                }
            }
        }
        return pile.isEmpty();
      
        }



}