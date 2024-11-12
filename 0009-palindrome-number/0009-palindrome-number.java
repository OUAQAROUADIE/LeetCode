class Solution {
    public boolean isPalindrome(int x) {
        String s =Integer.toString(x);
        String  sb = new StringBuilder(s).reverse().toString();
        return s.equals(sb);

       /* String n = Integer.toString(x);
       String r="";
       for(int i = n.length()-1  ; i >=0 ; i--){
        r+= n.charAt(i);
       }
       if(n.equals(r)){
        return true;
       }
       return false;
    }*/
    }
}