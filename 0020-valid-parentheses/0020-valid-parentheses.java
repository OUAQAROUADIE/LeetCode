class Solution {
    public boolean isValid(String s) {
    Stack<Character> p = new Stack<>();
    Map<Character,Character> map = new HashMap<>();

    map.put(')', '(');
    map.put('}','{');
    map.put(']','[');

    for(char c : s.toCharArray()){
        if(map.containsValue(c)){
            p.push(c);
        }else{
        if(map.containsKey(c)){
            if(p.isEmpty() || map.get(c) != p.pop()){
                return false;
            }
        }
    }
    }
    return p.isEmpty();
    }

    



}