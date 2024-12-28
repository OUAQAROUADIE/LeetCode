class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        Stack<Character> pile = new Stack<>();
        map.put(')','(');
        map.put('}', '{');
        map.put(']', '[');
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(pile.isEmpty() || map.get(c) != pile.pop()){
                    return false;
                }

        } 
        else{
             pile.push(c);
        }
        }
        return pile.isEmpty();
       
    }
}